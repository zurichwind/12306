package cn.zurish.index12306.biz.userservice.dao.mapper;

import cn.zurish.index12306.biz.userservice.dao.entity.UserMailDO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * 用户邮箱表持久层
 * 2024/4/25 上午11:08
 */
public interface UserMailMapper extends BaseMapper<UserMailDO> {

    /**
     * 注销用户
     *
     * @param userMailDO 注销用户入参
     */
    void deletionUser(UserMailDO userMailDO);
}
