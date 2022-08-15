package com.ayun.stdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ayun.stdemo.mapper")
public class StDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(StDemoApplication.class, args);
    }

}
