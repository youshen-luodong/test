package com.hs.tz.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/luo")
public class TestController {
    @RequestMapping("/test")
    public String test() {
        System.out.println("test");
        String.format("[%s]: Hello,%s");
        return "success";
    }
}
