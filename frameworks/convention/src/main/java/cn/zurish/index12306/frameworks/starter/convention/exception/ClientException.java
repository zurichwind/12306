package cn.zurish.index12306.frameworks.starter.convention.exception;

import cn.zurish.index12306.frameworks.starter.convention.errorcode.BaseErrorCode;
import cn.zurish.index12306.frameworks.starter.convention.errorcode.IErrorCode;

/**
 * 客户端异常
 * 2024/4/24 下午6:35
 */
public class ClientException extends AbstractException {

    public ClientException(IErrorCode errorCode) {
        this(null, null, errorCode);
    }

    public ClientException(String message) {
        this(message, null, BaseErrorCode.CLIENT_ERROR);
    }

    public ClientException(String message, IErrorCode errorCode) {
        this(message, null, errorCode);
    }

    public ClientException(String message, Throwable throwable, IErrorCode errorCode) {
        super(message, throwable, errorCode);
    }

    @Override
    public String toString() {
        return "ClientException{" +
                "code='" + errorCode + "'," +
                "message='" + errorMessage + "'" +
                '}';
    }
}
