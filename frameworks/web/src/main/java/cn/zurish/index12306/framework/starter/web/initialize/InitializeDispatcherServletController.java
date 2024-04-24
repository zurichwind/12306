package cn.zurish.index12306.framework.starter.web.initialize;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static cn.zurish.index12306.framework.starter.web.config.WebAutoConfiguration.INITIALIZE_PATH;

/**
 * 初始化 {@link org.springframework.web.servlet.DispatcherServlet}
 * 2024/4/24 下午8:38
 */
@Slf4j(topic = "Initialize DispatcherServlet")
@RestController
public final class InitializeDispatcherServletController {

    @GetMapping(INITIALIZE_PATH)
    public void initializeDispatcherServlet() {
        log.info("Initialized the dispatcherServlet to improve the first response time of the interface...");
    }
}
