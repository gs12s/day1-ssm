package com.hpf.service;

import com.hpf.pojo.User;

import java.util.List;

public interface UserService {

    //查询所有用户数据
    List<User> findAllUser();

}
