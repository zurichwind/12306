package cn.zurish.index12306.framework.starter.convention.errorcode;

/**
 * 平台错误码
 * 2024/4/24 下午6:33
 */
public interface IErrorCode {

    /**
     * 错误码
     */
    String code();

    /**
     * 错误信息
     */
    String message();
}
