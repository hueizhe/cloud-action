package com.cloud.cloudrabbitmq.rabbit.hello;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class HelloSender {

    @Autowired
    private AmqpTemplate rabblitTemplate;

    public void send(){

        String contenxt = "hell  "+ new Date();

        this.rabblitTemplate.convertAndSend("hello", contenxt);
    }

}
