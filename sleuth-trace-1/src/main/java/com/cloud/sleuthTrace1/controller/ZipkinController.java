package com.cloud.sleuthTrace1.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class ZipkinController {


    @Autowired
    RestTemplate restTemplate;
    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }


    private static final Logger LOG = LoggerFactory.getLogger(ZipkinController.class);

    @GetMapping(value="/zipkin1")
    public String zipkinService1() {
        LOG.info("Inside zipkinService 2..");
        LOG.info("Now let's create some intentional delay...");

        try {
            Thread.sleep(20 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        LOG.info("returning afte delay..");
 //       restTemplate.getForObject("http://localhost:20002/zipkin2", String.class);
        return "Hi...";
    }


    @GetMapping("/trace-1")
    public String trace(){
        LOG.info("------------------<call    trace-1>-------------------");
        return "Trace";
    }
}
