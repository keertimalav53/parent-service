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
    public String message() {
        return "spring boot app !!" + serverPort;
    }

    // 1 build and test
    // 2 build docker image
    //3  push image to docker hub

    // drictoly github provide to readymade feature no need configure
    ///   maven.yml file
    // 1. login to docker hub
    //   2.  build the docker image
    //  3. push that image to docker hub


    /// git hub action read your docker file and it will create a docker image
    /// it will image to push image to docker hub


}
