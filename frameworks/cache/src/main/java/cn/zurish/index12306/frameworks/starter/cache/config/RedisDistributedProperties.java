package cn.zurish.index12306.frameworks.starter.cache.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.concurrent.TimeUnit;

/**
 * 分布式缓存配置
 * 2024/4/24 下午3:09
 */
@Data
@ConfigurationProperties(prefix = RedisDistributedProperties.PREFIX)
public class RedisDistributedProperties {

    public static final String PREFIX = "framework.cache.redis";

    /**
     * Key 前缀
     */
    private String prefix = "";

    /**
     * Key 前缀字符集
     */
    private String prefixCharset = "UTF-8";

    /**
     * 默认超时时间
     */
    private Long valueTimeout = 30000L;

    /**
     * 时间单位
     */
    private TimeUnit valueTimeUnit = TimeUnit.MILLISECONDS;
}
