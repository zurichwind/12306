package cn.zurish.index12306.framework.starter.log.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Log 注解打印，可以标记在类或者方法上
 * 2024/4/24 下午8:04
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ILog {

    /**
     * 入参打印
     *
     * @return 打印结果中是否包含入参，{@link Boolean#TRUE} 打印，{@link Boolean#FALSE} 不打印
     */
    boolean input() default true;

    /**
     * 出参打印
     *
     * @return 打印结果中是否包含出参，{@link Boolean#TRUE} 打印，{@link Boolean#FALSE} 不打印
     */
    boolean output() default true;
}
