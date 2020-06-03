package com.example.service.implement;

import org.springframework.stereotype.Service;
import service.UserService;

@Service
public class UserServiceImplement2 implements UserService {
    @Override
    public String findUserByID(String userID) {
        return "Second Implement: " + userID;
    }
}
