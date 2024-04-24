package cn.zurish.index12306.framework.starter.common.enums;

/**
 * 标识枚举，非 {@link Boolean#TRUE} 即 {@link Boolean#FALSE}
 * 2024/4/24 下午3:42
 */
public enum FlagEnum {

    /**
     * FALSE
     */
    FALSE(0),

    /**
     * TRUE
     */
    TRUE(1);

    private final Integer flag;

    FlagEnum(Integer flag) {
        this.flag = flag;
    }

    public Integer code() {
        return this.flag;
    }

    public String strCode() {
        return String.valueOf(this.flag);
    }

    @Override
    public String toString() {
        return strCode();
    }
}
