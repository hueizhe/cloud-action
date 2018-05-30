package com.cloud.cloudappportal.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class IndexController {

    @GetMapping("/")
    public String  Index(){
        HashMap<String, String> stringMap = new HashMap<>();
        stringMap.put("jack", "tommorw");
        stringMap.put("jack1", "tommorw1");
        stringMap.put("jack2", "tommorw2");
        return "index";
    }

}
