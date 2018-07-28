package com.caochengyin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Cao Chengyin
 * @version v 1.0.0
 * @date 2018/7/28 0028
 * @description JSP Controller
 */
@Controller
@RequestMapping(value = {"/jsp"})
public class JspController {

    @GetMapping("/index")
    public String index(Model model) {
        model.addAttribute("msg", "Spring Boot集成JSP!");
        return "index";
    }
}
