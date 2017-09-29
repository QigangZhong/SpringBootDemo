package com.qigang.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoApiController
{
    @RequestMapping("/greeting")
    public String greeting() {
        return "Hello World!";
    }

    @RequestMapping("/test")
    public String test(){
        return "test...";
    }
}
