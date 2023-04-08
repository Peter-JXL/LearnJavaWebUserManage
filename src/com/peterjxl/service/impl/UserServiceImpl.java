package com.peterjxl.service.impl;

import com.peterjxl.dao.UserDao;
import com.peterjxl.dao.impl.UserDaoImpl;
import com.peterjxl.domain.User;
import com.peterjxl.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserDao dao = new UserDaoImpl();
    @Override
    public List<User> findAll() {
        return dao.findAll();
    }
}
