package cn.zurish.index12306.frameworks.starter.common.enums;

/**
 * 删除标记枚举
 * 2024/4/24 下午3:41
 */
public enum DelEnum {

    /**
     * 正常状态
     */
    NORMAL(0),

    /**
     * 删除状态
     */
    DELETE(1);

    private final Integer statusCode;

    DelEnum(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public Integer code() {
        return this.statusCode;
    }

    public String strCode() {
        return String.valueOf(this.statusCode);
    }

    @Override
    public String toString() {
        return strCode();
    }
}
