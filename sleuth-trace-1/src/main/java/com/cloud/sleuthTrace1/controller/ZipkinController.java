package com.cloud.sleuthTrace1.controller;

import com.netflix.ribbon.proxy.annotation.Http;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

public class ZipkinController {


    @Autowired
    RestTemplate restTemplate;
    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }


    private static final Logger LOG = LoggerFactory.getLogger(ZipkinController.class);

    @GetMapping(value="/zipkin2")
    public String zipkinService1() {
        LOG.info("Inside zipkinService 2..");
        LOG.info("Now let's create some intentional delay...");
        try {
            Thread.sleep(20 * 1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        LOG.info("returning afte delay..");

        return "Hi...";
    }


    @GetMapping("/trace-1")
    public String trace(){
        LOG.info("------------------<call    trace-1>-------------------");
        return "Trace";
    }
}
