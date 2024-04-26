package cn.zurish.index12306.biz.userservice.service.impl;

import cn.hutool.core.util.StrUtil;
import cn.zurish.index12306.biz.userservice.dao.entity.UserDO;
import cn.zurish.index12306.biz.userservice.dao.entity.UserDeletionDO;
import cn.zurish.index12306.biz.userservice.dao.entity.UserMailDO;
import cn.zurish.index12306.biz.userservice.dao.mapper.UserDeletionMapper;
import cn.zurish.index12306.biz.userservice.dao.mapper.UserMailMapper;
import cn.zurish.index12306.biz.userservice.dao.mapper.UserMapper;
import cn.zurish.index12306.biz.userservice.dto.req.UserUpdateReqDTO;
import cn.zurish.index12306.biz.userservice.dto.resp.UserQueryActualRespDTO;
import cn.zurish.index12306.biz.userservice.dto.resp.UserQueryRespDTO;
import cn.zurish.index12306.biz.userservice.service.UserService;
import cn.zurish.index12306.framework.starter.common.toolkit.BeanUtil;
import cn.zurish.index12306.framework.starter.convention.exception.ClientException;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Optional;

/**
 * 用户信息接口实现层
 * 2024/4/26 下午12:18
 */
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;

    private final UserDeletionMapper userDeletionMapper;

    private final UserMailMapper userMailMapper;

    @Override
    public UserQueryRespDTO queryUserByUserId(String userId) {
        LambdaQueryWrapper<UserDO> queryWrapper = new LambdaQueryWrapper<UserDO>()
                .eq(UserDO::getId, userId);
        UserDO userDO = userMapper.selectOne(queryWrapper);
        if (userDO == null) {
            throw new ClientException("用户不存在，请检查用户ID是否正确");
        }
        return BeanUtil.convert(userDO, UserQueryRespDTO.class);
    }

    @Override
    public UserQueryRespDTO queryUserByUsername(String username) {
        LambdaQueryWrapper<UserDO> queryWrapper = new LambdaQueryWrapper<UserDO>()
                .eq(UserDO::getUsername, username);
        UserDO userDO = userMapper.selectOne(queryWrapper);
        if (userDO == null) {
            throw new ClientException("用户不存在，请检查用户名是否正确");
        }
        return BeanUtil.convert(userDO, UserQueryRespDTO.class);
    }

    @Override
    public UserQueryActualRespDTO queryActualUserByUsername(String username) {
        return BeanUtil.convert(queryUserByUsername(username), UserQueryActualRespDTO.class);
    }

    @Override
    public Integer queryUserDeletionNum(Integer idType, String idCard) {
        LambdaQueryWrapper<UserDeletionDO> queryWrapper = new LambdaQueryWrapper<UserDeletionDO>()
                .eq(UserDeletionDO::getIdType, idType)
                .eq(UserDeletionDO::getIdCard, idCard);
        // TODO 此处应该先查缓存
        Long deletionCount = userDeletionMapper.selectCount(queryWrapper);
        return Optional.ofNullable(deletionCount).map(Long::intValue).orElse(0);
    }

    @Override
    public void update(UserUpdateReqDTO requestParam) {
        UserQueryRespDTO userQueryRespDTO = queryUserByUsername(requestParam.getUsername());
        UserDO userDO = BeanUtil.convert(requestParam, UserDO.class);
        LambdaUpdateWrapper<UserDO> userUpdateWrapper = new LambdaUpdateWrapper<UserDO>()
                .eq(UserDO::getUsername, requestParam.getUsername());
        userMapper.update(userUpdateWrapper);
        if (StrUtil.isNotBlank(requestParam.getMail()) && !Objects.equals(requestParam.getMail(), userDO.getMail())) {
            LambdaUpdateWrapper <UserMailDO> updateWrapper = Wrappers.lambdaUpdate(UserMailDO.class)
                    .eq(UserMailDO::getMail, requestParam.getMail());
            userMailMapper.delete(updateWrapper);
            UserMailDO userMailDO = UserMailDO.builder()
                    .mail(requestParam.getMail())
                    .username(requestParam.getUsername())
                    .build();
            userMailMapper.insert(userMailDO);
        }
    }
}
