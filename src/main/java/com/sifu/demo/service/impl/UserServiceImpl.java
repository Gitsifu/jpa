package com.sifu.demo.service.impl;

import com.sifu.demo.pojo.User;
import com.sifu.demo.repository.UserRepository;
import com.sifu.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author sifu
 * @version 1.0
 * @date 2017/12/4
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User save(User user) {
        return userRepository.save(user);

    }

    @Override
    public User update(User user) {
        return userRepository.saveAndFlush(user);
    }


}
