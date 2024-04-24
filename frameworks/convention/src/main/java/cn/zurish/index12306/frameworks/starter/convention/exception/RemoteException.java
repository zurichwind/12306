package cn.zurish.index12306.frameworks.starter.convention.exception;

import cn.zurish.index12306.frameworks.starter.convention.errorcode.BaseErrorCode;
import cn.zurish.index12306.frameworks.starter.convention.errorcode.IErrorCode;

/**
 * 远程服务调用异常
 * 2024/4/24 下午6:35
 */
public class RemoteException extends AbstractException {

    public RemoteException(String message) {
        this(message, null, BaseErrorCode.REMOTE_ERROR);
    }

    public RemoteException(String message, IErrorCode errorCode) {
        this(message, null, errorCode);
    }

    public RemoteException(String message, Throwable throwable, IErrorCode errorCode) {
        super(message, throwable, errorCode);
    }

    @Override
    public String toString() {
        return "RemoteException{" +
                "code='" + errorCode + "'," +
                "message='" + errorMessage + "'" +
                '}';
    }
}
