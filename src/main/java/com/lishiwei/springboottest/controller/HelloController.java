package com.lishiwei.springboottest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/")
    public String index(ModelMap map) {
        map.addAttribute("host", "http://aa.aa");
        return "index";
    }

}
