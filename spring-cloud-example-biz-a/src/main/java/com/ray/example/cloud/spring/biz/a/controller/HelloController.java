package com.ray.example.cloud.spring.biz.a.controller;

import com.ray.example.cloud.spring.biz.a.service.RemoteService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    RemoteService remoteService;

    @GetMapping
    public String sayHello() {
        return "Hello，This is Biz-A Service！";
    }

    @GetMapping(path = "/call2b")
    public String sayHello2B() {
        return remoteService.sayHello();
    }
}
