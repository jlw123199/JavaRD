package redisapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/greet")
    public String greet(String name) {
        return "Hi" + name;
    }
}
