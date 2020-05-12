package com.example.redissentinel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestController {


    @Autowired(required = false)
    public void setRedisTemplate(RedisTemplate redisTemplate) {
        RedisSerializer stringSerializer = new StringRedisSerializer();
        redisTemplate.setKeySerializer(stringSerializer);
        redisTemplate.setValueSerializer(stringSerializer);
        redisTemplate.setHashKeySerializer(stringSerializer);
        redisTemplate.setHashValueSerializer(stringSerializer);
        this.redisTemplate = redisTemplate;
    }

    @Autowired
    RedisTemplate redisTemplate;


    @RequestMapping("/greet")
    public String greet(String name) {
//        redisTemplate.setKeySerializer(new StringRedisSerializer());
        String key = "a1";
        Boolean hasKey = redisTemplate.hasKey(key);

        String value = (String) redisTemplate.opsForValue().get("a1");

        redisTemplate.opsForValue().set("a1", name);

        value = (String) redisTemplate.opsForValue().get("a1");

        return "Hi" + name + "--Redis Value" + value;
    }

    @RequestMapping("/del")
    public String del(String name) {
//        redisTemplate.setKeySerializer(new StringRedisSerializer());
        String key = "a1";
        Boolean hasKey = redisTemplate.hasKey(key);

        redisTemplate.delete("a1");

        String value = (String) redisTemplate.opsForValue().get("a1");

        return "Hi" + name + "--Redis Value" + value;
    }
}
