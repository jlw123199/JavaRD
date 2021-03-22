package com.xl.actuator;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dc")
public class DaemonController {

    @RequestMapping(value = "/greet")
    public String greet( String name ){
        return "Hi " + name;
    }
}
