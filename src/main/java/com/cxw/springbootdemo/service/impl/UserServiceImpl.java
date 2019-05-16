package com.cxw.springbootdemo.service.impl;

import com.cxw.springbootdemo.Mapper.UserMapper;
import com.cxw.springbootdemo.entity.User;
import com.cxw.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    @Cacheable(value = "UserCache",key = "'user.getAllUsers'")
    public List<User> getAllUser() {
        return  userMapper.list();
    }

    @Override
    public User getUserById(Integer id) {
        return userMapper.getUserById(id);
    }
}
