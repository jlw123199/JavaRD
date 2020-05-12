package com.example.headerapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Parameter;

@SpringBootApplication
@RestController
public class HeaderAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(HeaderAppApplication.class, args);
    }

    @Autowired
    WebApplicationContext applicationContext;

    @RequestMapping("/")
    public String getname(@RequestHeader HttpHeaders headers, @RequestParam String str) {
        return "test" + "--" + headers.getHost() + "--" + headers.get("x-forwarded-for") + "--Str: " + str;
    }


    @PostMapping("/p")
    public String getname1(@RequestHeader HttpHeaders headers, @RequestBody String str) {
        RequestMappingHandlerMapping mapping = applicationContext.getBean(RequestMappingHandlerMapping.class);
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();

        return "Host: " + headers.getHost() + ", Custom header: " + headers.get("x-forwarded-for") + " ,Paramete String: " + str + ",RequestURL: " + headers.getLocation();


    }

}
/*



 */