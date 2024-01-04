package com.example.serve.Impl;

import com.example.entry.User;
import com.example.mapper.UserMapper;
import com.example.serve.UserServe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author:马薪章
 * @Version:1.0
 **/
@Service
public class UserImpl implements UserServe {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User login(User user) {
        return userMapper.login(user);
    }

    @Override
    public void save(User user) {
        userMapper.save(user);
    }
}
