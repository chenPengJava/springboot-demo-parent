package com.yitong;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableEurekaClient
@EnableSwagger2
@MapperScan(basePackages={"com.yitong.domain.repository"})
public class DeptServiceApplication8004 {

    public static void main(String[] args) {
        SpringApplication.run(DeptServiceApplication8004.class, args);
    }

}
