package com.ray.example.cloud.spring.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author yurg
 * @version 1.0
 * @date 2020/3/31 16:27
 * @description : 服务网关
 */
@SpringBootApplication
@EnableZuulProxy
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
