package com.example.log4;

import lombok.extern.slf4j.Slf4j;
import lombok.extern.slf4j.XSlf4j;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @XSlf4j
    public String greed(String param){

        return "Greed:" + param;
    }
}
