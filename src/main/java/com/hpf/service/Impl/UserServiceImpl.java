package com.hpf.service.Impl;

import com.hpf.dao.UserDao;
import com.hpf.pojo.User;
import com.hpf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    //注入userDao
    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findAllUser() {
        return userDao.findUser();
    }
}
