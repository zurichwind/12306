package cn.zurish.index12306.biz.userservice.dao.entity;

import cn.zurish.index12306.framework.starter.database.base.BaseDO;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户手机号实体对象
 * 2024/4/25 上午11:05
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@TableName("t_user_phone")
public class UserPhoneDO extends BaseDO {

    /**
     * id
     */
    private Long id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 注销时间戳
     */
    private Long deletionTime;
}
