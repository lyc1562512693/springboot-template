package com.surfilter.bootmybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@MapperScan("com.surfilter.bootmybatis.ssm.dao")
public class BootmybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootmybatisApplication.class, args);
    }

}
