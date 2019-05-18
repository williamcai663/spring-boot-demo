package com.cxw.springbootdemo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.Queue;

@RestController
public class QueueController {

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @Autowired
    private Queue queue;

    @GetMapping("/send")
    public void sendMessage() {
        this.jmsMessagingTemplate.convertAndSend(this.queue, "this is a good girl");
    }
}
