package com.sifu.demo.controller;

import com.sifu.demo.pojo.User;
import com.sifu.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sifu
 * @version 1.0
 * @date 2017/12/4
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/save")
    public User save(User user){
        return userService.save(user);
    }

    @PostMapping("/update")
    public User update(User user){
        return userService.update(user);
    }
}
