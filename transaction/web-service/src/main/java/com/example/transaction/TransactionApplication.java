package com.example.transaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = "com.example")
public class TransactionApplication {

    public static ConfigurableApplicationContext getContext() {
        return context;
    }

    static ConfigurableApplicationContext context = null;


    public static void main(String[] args) {
        context = SpringApplication.run(TransactionApplication.class, args);

    }

}
