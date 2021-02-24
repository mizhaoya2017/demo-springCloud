package com.example.ribbonprovider.service;

import org.springframework.stereotype.Service;

@Service
public class ProviderService {

    public String getProvider() {
        return "ribbon provider";
    }
}