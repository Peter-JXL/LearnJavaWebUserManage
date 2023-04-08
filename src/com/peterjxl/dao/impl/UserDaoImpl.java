package com.peterjxl.dao.impl;

import com.peterjxl.dao.UserDao;
import com.peterjxl.domain.User;
import com.peterjxl.util.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class UserDaoImpl implements UserDao {
    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
    @Override
    public List<User> findAll() {
        String sql = "select * from users";
        List<User> users = template.query(sql, new BeanPropertyRowMapper<User>(User.class));
        return users;
    }

    @Override
    public void InsertOne(User user) {
        String sql = "insert into users (name, gender, age, address, qq, email) values (?, ?,  ?,  ?,  ?,  ?)";
        template.update(sql, user.getName(), user.getGender(), user.getAge(), user.getAddress(), user.getQq(), user.getEmail());
    }

    @Override
    public void deleteOne(String id) {
        String sql = "delete from users where id = ?";
        template.update(sql, id);
    }

    @Override
    public void updateOne(User user) {
        String sql = "update users set name = ?, gender = ?, age = ?, address = ?, qq = ?, email = ? where id = ?";
        template.update(sql, user.getName(), user.getGender(), user.getAge(), user.getAddress(), user.getQq(), user.getEmail(), user.getId());
    }


}

