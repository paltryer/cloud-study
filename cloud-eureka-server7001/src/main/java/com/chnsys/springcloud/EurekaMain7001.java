package com.chnsys.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Eureka注册中心
 *
 * @author Wangchao
 * @version 1.0
 * @description Eureka服务
 * @date 2021/5/9 23:30
 */
@SpringBootApplication
//开启为Eureka的服务器
@EnableEurekaServer
public class EurekaMain7001 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaMain7001.class, args);
    }

}
