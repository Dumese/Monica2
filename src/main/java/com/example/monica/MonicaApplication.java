package com.example.monica;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@EnableAsync
@EnableTransactionManagement(proxyTargetClass = true)
@MapperScan("com.example.monica.mapper")
@SpringBootApplication
public class MonicaApplication {
    public static void main(String[] args) {
        SpringApplication.run(MonicaApplication.class, args);
        System.out.println("启动成功");
    }

}
