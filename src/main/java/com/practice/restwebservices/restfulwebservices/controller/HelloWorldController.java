package com.practice.restwebservices.restfulwebservices.controller;

import com.practice.restwebservices.restfulwebservices.model.HelloBean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping(path = "/hello", method = RequestMethod.GET)
    public HelloBean hello() {
        return new HelloBean( "Hello World");
    }
}
