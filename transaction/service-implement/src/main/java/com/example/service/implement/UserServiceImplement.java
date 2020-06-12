package com.example.service.implement;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import service.UserService;

@Service("first")
@Primary
public class UserServiceImplement implements UserService {
    @Override
    public String findUserByID(String userID) {
        return "First Implement:" + userID;
    }
/*


*/
}
