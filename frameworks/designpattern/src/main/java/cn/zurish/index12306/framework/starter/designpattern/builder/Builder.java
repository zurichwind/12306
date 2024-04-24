package cn.zurish.index12306.framework.starter.designpattern.builder;

import java.io.Serializable;

/**
 * Builder 模式抽象接口
 * 2024/4/24 下午5:32
 */
public interface Builder<T> extends Serializable {

    /**
     * 构建方法
     *
     * @return 构建后的对象
     */
    T build();
}
