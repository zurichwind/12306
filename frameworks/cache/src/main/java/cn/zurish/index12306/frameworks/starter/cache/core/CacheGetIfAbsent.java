package cn.zurish.index12306.frameworks.starter.cache.core;

/**
 * 2024/4/24 下午2:48
 */
@FunctionalInterface
public interface CacheGetIfAbsent<T> {

    /**
     * 如果查询结果为空，执行逻辑
     */
    void execute(T param);
}
