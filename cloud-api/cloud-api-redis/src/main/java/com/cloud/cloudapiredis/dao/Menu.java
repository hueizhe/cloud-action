package com.cloud.cloudapiredis.dao;

import java.util.ConcurrentModificationException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

public class Menu {

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;

        Map<String, Object> hashMap =  new ConcurrentHashMap<>();

        hashMap.putIfAbsent("start", "joke");

    }
}
