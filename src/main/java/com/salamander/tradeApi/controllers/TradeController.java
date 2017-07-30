package com.salamander.tradeApi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TradeController {

    @GetMapping("/")
    public String getMessage(){
        return "Hello Trade Api";
    }
}
