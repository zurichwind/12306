package cn.zurish.index12306.framework.starter.cache.core;

/**
 * 缓存加载器
 * 2024/4/24 下午2:50
 */
@FunctionalInterface
public interface CacheLoader<T> {

    /**
     * 加载缓存
     */
    T load();
}
