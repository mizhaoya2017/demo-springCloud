package com.example.ribbonconsumer.controller;

import com.example.ribbonconsumer.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    ConsumerService consumerService;

    @GetMapping(value = "/index")
    public String index() {
        return "ribbon consumer/ " + consumerService.getConsumer();
    }
}
