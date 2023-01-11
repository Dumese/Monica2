package com.example.monica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MonicaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MonicaApplication.class, args);
        System.out.println("启动成功");
    }

}
