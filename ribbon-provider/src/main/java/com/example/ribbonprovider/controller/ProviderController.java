package com.example.ribbonprovider.controller;

import com.example.ribbonprovider.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {

    @Autowired
    ProviderService providerService;

    @GetMapping(value = "/index")
    public String index() {
        return providerService.getProvider();
    }
}
