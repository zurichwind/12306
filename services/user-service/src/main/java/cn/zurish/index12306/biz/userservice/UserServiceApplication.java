package cn.zurish.index12306.biz.userservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 用户服务应用启动器
 * 2024/4/25 上午10:27
 */
@SpringBootApplication
@MapperScan("cn.zurish.index12306.biz.userservice.dao.mapper")
public class UserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserServiceApplication.class, args);
    }
}
