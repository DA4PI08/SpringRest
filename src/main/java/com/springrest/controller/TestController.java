package com.springrest.controller;

import com.springrest.model.TestModel;
import com.springrest.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("v1")
public class TestController {

    private final TestService testService;
    private final RestTemplate restTemplate;

    @Autowired
    public TestController(TestService testService, RestTemplate restTemplate){

        this.testService = testService;
        this.restTemplate = restTemplate;
    }

    @GetMapping("/test")
    public String test(){
        return "Namaste world!";
    }

    @GetMapping("/fetch")
    public String fetch(){
        return testService.fetch();
    }

    @GetMapping("/fetchAll")
    public List<TestModel> fetchAll(){
        return testService.findAllTestModel();
    }

    @GetMapping("/restCall")
    public String restTemp(){
        return "";
        //restTemplate.exchange("");
    }
}
