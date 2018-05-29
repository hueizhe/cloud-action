package com.cloud.sleuthTrace2.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TraceController {

    private final Logger logger = LoggerFactory.getLogger(TraceController.class);

    @Autowired
    RestTemplate restTemplate;
    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @GetMapping("/trace-2")
    public String trace(){
        logger.info("------------------<call    trace-2>-------------------");
        return "Trace-2";
    }


    @GetMapping(value="/zipkin2")
    public String zipkinService1() {
        logger.info("Inside zipkinService 2..");
        logger.info("Now let's create some intentional delay...");


        logger.info("returning afte delay..");
        restTemplate.getForObject("http://localhost:20001/zipkin1", String.class);
        return "Hi...  zipkin2";
    }
}
