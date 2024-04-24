package cn.zurish.index12306.framework.starter.user.config;

import cn.zurish.index12306.framework.starter.user.core.UserTransmitFilter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import static cn.zurish.index12306.framework.starter.bases.constant.FilterOrderConstant.USER_TRANSMIT_FILTER_ORDER;

/**
 * 用户配置自动装配
 * 2024/4/24 下午2:29
 */
@ConditionalOnWebApplication
public class UserAutoConfiguration {

    /**
     * 用户信息传递过滤器
     */
    @Bean
    public FilterRegistrationBean<UserTransmitFilter> globalUserTransmitFilter() {
        FilterRegistrationBean<UserTransmitFilter> registration = new FilterRegistrationBean<>();
        registration.setFilter(new UserTransmitFilter());
        registration.addUrlPatterns("/*");
        registration.setOrder(USER_TRANSMIT_FILTER_ORDER);
        return registration;
    }
}
