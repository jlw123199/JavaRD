package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.transaction.annotation.Transactional;


@Configuration
public class HitService {

    private static int requestCount =0;
    @Autowired
    private RedisTemplate redisTemplate;

    @Transactional
    public String hit(){
        requestCount = requestCount + 1;
        Integer value = Integer.parseInt( redisTemplate.opsForValue().get("count").toString());
        Integer newvalue = value + 1;
//        redisTemplate.opsForSet().remove("count",value);
//        redisTemplate.opsForSet().add("count",newvalue);
        redisTemplate.opsForValue().set("count",newvalue.toString());
        System.out.println(newvalue);
        System.out.println("Transaction: "  + requestCount );
        return newvalue.toString();
    }
}
