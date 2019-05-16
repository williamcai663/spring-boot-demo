package com.cxw.springbootdemo.service;

import com.cxw.springbootdemo.entity.User;

import java.util.List;

public interface UserService {

    List<User> getAllUser();

    User getUserById(Integer id);
}
