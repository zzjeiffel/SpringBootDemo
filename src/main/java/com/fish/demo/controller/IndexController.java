package com.fish.demo.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;
import java.util.Map;

@Controller
public class IndexController {
    public static final Logger logger=Logger.getLogger(IndexController.class);
    @GetMapping("/")
    public String index(Map<String,Object> model){
        logger.info("访问IndexController...");
        model.put("message","我的JSP和JSTL集成...");
        model.put("time",new Date());
        return "index";
    }
}
