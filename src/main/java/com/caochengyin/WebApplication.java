package com.caochengyin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author kevin
 */
@SpringBootApplication
public class WebApplication {

    public static void main(String[] args) {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>项目开始启动<<<<<<<<<<<<<<<<<<<<<<<<<");
        SpringApplication.run(WebApplication.class, args);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>项目启动完成<<<<<<<<<<<<<<<<<<<<<<<<<");
    }
}
