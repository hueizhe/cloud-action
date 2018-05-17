package com.cloud.feignconsumer.service;


import com.cloud.feignconsumer.config.LogConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "hello-service", configuration = LogConfig.class)
public interface HelloService {

    @RequestMapping("/")
    String hello();

}
