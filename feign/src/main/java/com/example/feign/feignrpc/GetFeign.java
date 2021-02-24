package com.example.feign.feignrpc;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "ribbon-consumer")
public interface GetFeign {

    @GetMapping(value = "index")
    public String getFeign();
}
