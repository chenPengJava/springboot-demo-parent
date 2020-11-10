package com.yitong;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
//@EnableFeignClients
@MapperScan(basePackages={"com.yitong.domain.repository"})
public class DeptServiceApplication8003 {

    public static void main(String[] args) {
        SpringApplication.run(DeptServiceApplication8003.class, args);
    }

}
