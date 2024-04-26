package cn.zurish.index12306.biz.userservice.dao.mapper;

import cn.zurish.index12306.biz.userservice.dao.entity.UserPhoneDO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * 用户手机号持久层
 * 2024/4/25 上午11:09
 */
public interface UserPhoneMapper extends BaseMapper<UserPhoneDO> {

    /**
     * 注销用户
     *
     * @param userPhoneDO 注销用户入参
     */
    void deletionUser(UserPhoneDO userPhoneDO);
}
