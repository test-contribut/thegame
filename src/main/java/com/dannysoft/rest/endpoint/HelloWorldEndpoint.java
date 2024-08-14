package com.dannysoft.rest.endpoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldEndpoint {

    @GetMapping(value = "/hello")
    public String hello(){
        return "Hello World";
    }
}
