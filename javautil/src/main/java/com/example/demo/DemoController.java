package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

//import java.util.concurrent.TimeUnit;

//import java.util.concurrent.*;

@RestController
public class DemoController {

    @RequestMapping(value = "/greet")
    public String greet(String name) {
        return "1Hi" + name + "-" + TimeUnit.DAYS.toNanos(23L);
    }

}
