package com.lqx.reggie;





import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//@Slf4j由lombok提供可以直接使用log日志打印
@Slf4j
@SpringBootApplication
public class ReggieApplication {
    public static void main(String[] args) {
        SpringApplication.run(ReggieApplication.class);
        log.info("瑞吉项目启动~~~~");
    }
}