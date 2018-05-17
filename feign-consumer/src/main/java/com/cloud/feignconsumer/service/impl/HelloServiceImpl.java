package com.cloud.feignconsumer.service.impl;

import com.cloud.feignconsumer.service.HelloService;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello() {
        return "hello fengin";
    }
}
