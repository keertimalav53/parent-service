package com.ims.web.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api/users")
public class HomeController {


    @Value("${server.port}")
    private String serverPort;


    @GetMapping("/message")
    public String message(){
        return "spring boot app !!" + serverPort;
    }
}
