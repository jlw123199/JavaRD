package com.example.transaction;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/index")
public class IndexController {

    @RequestMapping("/greed")
    public String greed(String name){
        testMysql();
        return "Hi " + name;
    }

    public void testMysql(){

        JdbcTemplate jdbcTemplate = TransactionApplication.context.getBean(JdbcTemplate.class);

        List<Map<String, Object>> result =

                jdbcTemplate.queryForList("SELECT * FROM transaction1");

        System.out.println(result);
    }
}
