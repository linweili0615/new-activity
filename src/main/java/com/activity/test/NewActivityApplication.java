package com.activity.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})  //禁用数据源自动配置
public class NewActivityApplication {

    public static void main(String[] args) {
        SpringApplication.run(NewActivityApplication.class, args);
    }

}

