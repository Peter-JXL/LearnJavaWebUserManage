package com.peterjxl.dao;

import com.peterjxl.domain.User;
import java.util.List;

public interface UserDao {


    /**
     * 查询所有用户信息
     * @return
     */
    List<User> findAll();
}
