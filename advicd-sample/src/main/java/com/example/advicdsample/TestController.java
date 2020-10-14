package com.example.advicdsample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

@RestController
@RequestMapping("/testController")
public class TestController {
    @RequestMapping(value = "/hashMapTest")
//    @ResponseBody
    public HashMap<String,String> hashMapTest(){
        HashMap<String,String> result = new HashMap<>();
        result.put("Name","Bill Gates");
        result.put("Age","88");
        return result;
    }


    @GetMapping(value = "/test")
    @ResponseBody
    public Map<String,String> test(){
        Map<String,String> result = new LinkedHashMap<String, String>();
        result.put("aa","bb");
        return result;
    }
}