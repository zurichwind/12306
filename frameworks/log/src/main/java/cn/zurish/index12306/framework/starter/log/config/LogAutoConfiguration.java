package cn.zurish.index12306.framework.starter.log.config;

import cn.zurish.index12306.framework.starter.log.annotation.ILog;
import cn.zurish.index12306.framework.starter.log.core.ILogPrintAspect;
import org.springframework.context.annotation.Bean;

/**
 * 日志自动装配
 * 2024/4/24 下午8:13
 */
public class LogAutoConfiguration {

    /**
     * {@link ILog} 日志打印 AOP 切面
     */
    @Bean
    public ILogPrintAspect iLogPrintAspect() {
        return new ILogPrintAspect();
    }
}
