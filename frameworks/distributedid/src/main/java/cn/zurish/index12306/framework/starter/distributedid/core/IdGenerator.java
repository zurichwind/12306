package cn.zurish.index12306.framework.starter.distributedid.core;

/**
 * ID 生成器
 * 2024/4/24 下午7:38
 */
public interface IdGenerator {

    /**
     * 下一个 ID
     */
    default long nextId() {
        return 0L;
    }

    /**
     * 下一个 ID 字符串
     */
    default String nextIdStr() {
        return "";
    }
}
