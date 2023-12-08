package cn.luckyneko.interchat;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author Lucky_He
 * @Description 启动类
 * @Date 2023/12/8 23:55
 */

@SpringBootApplication
public class LuckyInterchatWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(LuckyInterchatWebApplication.class, args);
    }
}
