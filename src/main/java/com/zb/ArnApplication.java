package com.zb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.zb.dao")
public class ArnApplication {

    public static void main(String[] args) {
        SpringApplication.run(ArnApplication.class, args);
    }

}
