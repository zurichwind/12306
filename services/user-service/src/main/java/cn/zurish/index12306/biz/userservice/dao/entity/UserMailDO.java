package cn.zurish.index12306.biz.userservice.dao.entity;

import cn.zurish.index12306.framework.starter.database.base.BaseDO;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户邮箱表实体对象
 * 2024/4/25 上午11:04
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@TableName("t_user_mail")
public class UserMailDO extends BaseDO {

    /**
     * id
     */
    private Long id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 邮箱
     */
    private String mail;

    /**
     * 注销时间戳
     */
    private Long deletionTime;
}
