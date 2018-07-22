package com.caochengyin.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Cao Chengyin
 * @version v 1.0.0
 * @date 2018/7/22 0022
 * @description 配置文件测试Controller
 */
@Controller
@RequestMapping(value = {"/config"})
public class ConfigController {
    @Value(value = "#{'${hello.slogan:不太欢迎使用SpringBoot!}'}")
    private String helloSlogan;

    @Value(value = "#{'${hello.array}'.split(';')}")
    private String[] helloArray;

    @ResponseBody
    @RequestMapping(value = "/hello")
    public String hello() {
        return helloSlogan;
    }

    @RequestMapping(value = "/polling")
    public void pollingHello() {
        for (String hello : helloArray) {
            System.out.println(hello);
        }
    }
}
