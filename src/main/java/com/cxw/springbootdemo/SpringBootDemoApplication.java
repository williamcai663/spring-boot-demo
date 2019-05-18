package com.cxw.springbootdemo;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;

import javax.jms.Queue;


@SpringBootApplication
@EnableCaching
public class SpringBootDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoApplication.class, args);
    }


    @Bean
    public Queue queue() {
       return new ActiveMQQueue("active.queue");
    }
}
