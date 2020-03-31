package com.ray.example.cloud.spring.biz.b.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yurg
 * @version 1.0
 * @date 2020/3/31 16:12
 * @description : 控制器
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    public String sayHello() {
        return "Hello，This is Biz-B Service！";
    }
}
