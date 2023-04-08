package com.peterjxl.service;


import com.peterjxl.domain.User;

import java.util.List;

/**
 * 用户管理的业务接口
 */
public interface UserService {

    /**
     * 查询所有用户信息
     * @return
     */
    List<User> findAll();

    void InsertOne(User user);

    void deleteOne(String id);

    void updateOne(User user);
}
