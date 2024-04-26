package cn.zurish.index12306.biz.userservice.toolkit;

import static cn.zurish.index12306.biz.userservice.common.constant.Index12306Constant.USER_REGISTER_REUSE_SHARDING_COUNT;

/**
 * 用户名可复用工具类
 * 2024/4/25 上午11:20
 */
public final class UserReuseUtil {

    /**
     * 计算分片位置
     */
    public static int hashShardingIdx(String username) {
        return Math.abs(username.hashCode() % USER_REGISTER_REUSE_SHARDING_COUNT);
    }
}
