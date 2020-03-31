package com.ray.example.cloud.spring.biz.a.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author yurg
 * @version 1.0
 * @date 2020/3/31 16:58
 * @description : 调用其他服务
 */
@FeignClient(name = "spring-cloud-example-biz-b") // 指定服务名称
public interface RemoteService {

    /**
     * 调用服务B的hello方法
     *
     * @return
     */
    @GetMapping("/hello") //指定请求地址
    String sayHello();
}
