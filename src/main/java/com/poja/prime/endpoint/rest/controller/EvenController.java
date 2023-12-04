package com.poja.prime.endpoint.rest.controller;

import com.poja.prime.service.event.EvenService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@RestController
public class EvenController {
    private EvenService service;

    @GetMapping("/new-prime")
    public BigInteger isEven(){
        return service.isEven();
    }
}
