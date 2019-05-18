package com.cxw.springbootdemo.web;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @JmsListener(destination = "active.queue")
    public void readActiveQueue(String message) {
        System.out.println("the message is:" + message);
    }
}
