//package com.example.redissentinel;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.redis.connection.RedisConnectionFactory;
//import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
//import org.springframework.data.redis.core.RedisTemplate;
//
//@Configuration
//public class RedisConfig {
//    @Bean
//    public RedisConnectionFactory redisCF() {
//// JedisConnectionFactory rcf = new JedisConnectionFactory();
//        LettuceConnectionFactory rcf = new LettuceConnectionFactory();
////        rcf.setHostName("127.0.0.1");
////        rcf.setPort(6379);
////        rcf.setPassword();
//        return rcf;
//    }
//
////    @Bean
////    public RedisTemplate<String, Object> redisTemplate(RedisConnectionFactory factory) {
////        RedisTemplate<String, Object> template = new RedisTemplate<String, Object>();
////        template.setConnectionFactory(factory);
////        return template;
////    }
//
//}
