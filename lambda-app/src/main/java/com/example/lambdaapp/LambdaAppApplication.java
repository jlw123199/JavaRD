package com.example.lambdaapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class LambdaAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(LambdaAppApplication.class, args);

        loop();

    }

    public static void loop() {

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("j1", 1));
        personList.add(new Person("j2", 2));
        personList.add(new Person("j3", 3));

        personList.forEach(p -> {
            System.out.println(p.getName());
        });

//        () -> personList.size();
        List<Person> tem = personList.stream().filter(p -> p.getAge() >= 2).collect(Collectors.toList());
        tem.forEach(t -> {
            System.out.println(t.getName());
        });

        Person person = personList.stream().filter(p -> p.getAge() == 3).findFirst().orElse(null);
        System.out.println("First Object: " + person.getName());

    }

}
