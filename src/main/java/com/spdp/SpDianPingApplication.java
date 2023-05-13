package com.spdp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.spdp.mapper")
@SpringBootApplication
public class SpDianPingApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpDianPingApplication.class, args);
    }

}
