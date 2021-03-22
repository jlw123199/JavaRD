package com.example.advicdsample;

import lombok.Data;

@Data
public class LombokTest {
    @Override
    public String toString() {
        return "LombokTest{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    String name;
    String address;
}
