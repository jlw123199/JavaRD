package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;


@SpringBootApplication
public class DemoApplication {



	@Autowired
	private RedisTemplate redisTemplate;

	@Bean
	public RedisTemplate<String, Object> stringSerializerRedisTemplate() {
		RedisSerializer<String> stringSerializer = new StringRedisSerializer();
		redisTemplate.setKeySerializer(stringSerializer);
		redisTemplate.setValueSerializer(stringSerializer);
		redisTemplate.setHashKeySerializer(stringSerializer);
		redisTemplate.setHashValueSerializer(stringSerializer);
		return redisTemplate;
	}



	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
