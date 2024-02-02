package com.springrest.controller;

import com.springrest.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1")
public class TestController {

    private final TestService testService;

    @Autowired
    public TestController(TestService testService){

        this.testService = testService;
    }

    @GetMapping("/test")
    public String test(){
        return "Namaste world!";
    }

    @GetMapping("/fetch")
    public String fetch(){
        testService.fetch();
        return "Namaste world!";
    }
}
