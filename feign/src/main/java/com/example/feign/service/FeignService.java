package com.example.feign.service;

import com.example.feign.feignrpc.GetFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeignService {

    @Autowired
    GetFeign getFeign;

    public String getFeign() {
        return getFeign.getFeign();
    }
}