package com.cloud.helloservice.controller;

import com.cloud.helloservice.service.HelloService;
import com.cloud.helloservice.service.impl.HelloServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    HelloServiceImpl helloService;

    @RequestMapping
    public String home(){
        return helloService.helloService();
    }
}
