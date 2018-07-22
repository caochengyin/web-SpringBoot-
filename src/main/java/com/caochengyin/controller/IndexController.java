package com.caochengyin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Cao Chengyin
 * @version v 1.0.0
 * @date 2018/7/22 0022
 * @description 首页Controller
 */
@Controller
@RequestMapping(value = {"index","/"})
public class IndexController {
    /**
     * 简单扼欢迎页面
     * @return 欢迎语
     */
    @RequestMapping("/hello")
    public @ResponseBody String hello(){
        return "welcome to use Spring Boot!";
    }
}
