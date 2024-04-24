package cn.zurish.index12306.frameworks.starter.convention.exception;

import cn.zurish.index12306.frameworks.starter.convention.errorcode.BaseErrorCode;
import cn.zurish.index12306.frameworks.starter.convention.errorcode.IErrorCode;

import java.util.Optional;

/**
 * 服务端异常
 * 2024/4/24 下午6:46
 */
public class ServiceException extends AbstractException {

    public ServiceException(String message) {
        this(message, null, BaseErrorCode.SERVICE_ERROR);
    }

    public ServiceException(IErrorCode errorCode) {
        this(null, errorCode);
    }

    public ServiceException(String message, IErrorCode errorCode) {
        this(message, null, errorCode);
    }

    public ServiceException(String message, Throwable throwable, IErrorCode errorCode) {
        super(Optional.ofNullable(message).orElse(errorCode.message()), throwable, errorCode);
    }

    @Override
    public String toString() {
        return "ServiceException{" +
                "code='" + errorCode + "'," +
                "message='" + errorMessage + "'" +
                '}';
    }
}
