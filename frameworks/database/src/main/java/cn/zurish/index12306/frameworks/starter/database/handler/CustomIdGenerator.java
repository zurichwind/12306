package cn.zurish.index12306.frameworks.starter.database.handler;

import cn.zurish.index12306.frameworks.starter.distributedid.toolkit.SnowflakeIdUtil;
import com.baomidou.mybatisplus.core.incrementer.IdentifierGenerator;

/**
 * 自定义雪花算法生成器
 * 2024/4/24 下午7:20
 */
public class CustomIdGenerator implements IdentifierGenerator {

    @Override
    public Number nextId(Object entity) {
        return SnowflakeIdUtil.nextId();
    }
}
