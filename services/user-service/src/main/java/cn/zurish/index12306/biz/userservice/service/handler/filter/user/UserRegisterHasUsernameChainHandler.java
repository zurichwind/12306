package cn.zurish.index12306.biz.userservice.service.handler.filter.user;

import cn.zurish.index12306.biz.userservice.common.enums.UserRegisterErrorCodeEnum;
import cn.zurish.index12306.biz.userservice.dto.req.UserRegisterReqDTO;
import cn.zurish.index12306.biz.userservice.service.UserLoginService;
import cn.zurish.index12306.framework.starter.convention.exception.ClientException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * 用户注册用户名唯一检验
 * 2024/4/25 下午4:29
 */
@Component
@RequiredArgsConstructor
public final class UserRegisterHasUsernameChainHandler implements UserRegisterCreateChainFilter<UserRegisterReqDTO> {

    private final UserLoginService userLoginService;

    @Override
    public void handler(UserRegisterReqDTO requestParam) {
        if (!userLoginService.hasUsername(requestParam.getUsername())) {
            throw new ClientException(UserRegisterErrorCodeEnum.HAS_USERNAME_NOTNULL);
        }
    }

    @Override
    public int getOrder() {
        return 1;
    }
}
