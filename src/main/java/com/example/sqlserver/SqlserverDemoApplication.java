package com.example.sqlserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@EntityScan(basePackages = {"com.example.sqlserver.entity"})
@MapperScan("com.example.sqlserver.mapper")
@SpringBootApplication
public class SqlserverDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SqlserverDemoApplication.class, args);
    }

}
