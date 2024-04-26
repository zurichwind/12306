package cn.zurish.index12306.biz.userservice.service.handler.filter.user;

import cn.zurish.index12306.biz.userservice.common.enums.UserChainMarkEnum;
import cn.zurish.index12306.biz.userservice.dto.req.UserRegisterReqDTO;
import cn.zurish.index12306.framework.starter.designpattern.chain.AbstractChainHandler;

/**
 * 用户注册责任链过滤器
 * 2024/4/25 下午4:25
 */
public interface UserRegisterCreateChainFilter<T extends UserRegisterReqDTO> extends AbstractChainHandler<UserRegisterReqDTO> {

    @Override
    default String mark() {
        return UserChainMarkEnum.USER_REGISTER_FILTER.name();
    }
}
