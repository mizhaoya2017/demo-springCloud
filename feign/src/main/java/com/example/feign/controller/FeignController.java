package com.example.feign.controller;

import com.example.feign.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {

    @Autowired
    FeignService feignService;

    @GetMapping(value = "/feign/index")
    public String getFeign() {
        return "feign consumer/ " + feignService.getFeign();
    }
}