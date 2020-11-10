package com.qz.controller;

import com.qz.mapper.UserMapper;
import com.qz.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;
    @GetMapping("/queryUserList")
    public List<User> list(){
        List<User> users = userMapper.queryUserList();
        return users;

    }
    @GetMapping("/insertUser")
    public String insertUser(){
        User user = new User(111,"aaa","aaa");
        userMapper.insertUser(user);
        return "ok";
    }
    @GetMapping("/deleteUser")
    public String deleteUser(){
        userMapper.deleteUser(111);
        return "ok";
    }
    @GetMapping("/quertUserById")
    public User quertUserById(){
        User user = userMapper.quertUserById(111);
        return user;
    }
    @GetMapping("/updateUser")
    public String updateUser(){
        User user = new User(111,"aaa","BBB");
        userMapper.updateUser(user);
        return "ok";
    }
}
