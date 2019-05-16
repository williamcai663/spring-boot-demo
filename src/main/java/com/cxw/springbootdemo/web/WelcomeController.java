package com.cxw.springbootdemo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {


    @GetMapping("/welcome")
    public String dealRequest() {
        return "welcome";
    }
}
