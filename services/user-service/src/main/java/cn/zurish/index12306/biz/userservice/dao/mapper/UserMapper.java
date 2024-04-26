package cn.zurish.index12306.biz.userservice.dao.mapper;

import cn.zurish.index12306.biz.userservice.dao.entity.UserDO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * 用户信息持久层
 * 2024/4/25 上午11:08
 */
public interface UserMapper extends BaseMapper<UserDO> {

    /**
     * 注销用户
     *
     * @param userDO 注销用户入参
     */
    void deletionUser(UserDO userDO);
}
