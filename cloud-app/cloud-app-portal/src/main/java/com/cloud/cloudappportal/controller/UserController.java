package com.cloud.cloudappportal.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@Api(value = "user",tags = {"获取用户信息接口"})
@RestController
public class UserController {


    @ApiOperation(value = "/getUserList", notes = "查询用户列表", httpMethod = "get")
    @GetMapping("/getUserList")
    public String userList(@ApiParam(name="id",value = "id",required = true)String id){

        return "";
    }


}
