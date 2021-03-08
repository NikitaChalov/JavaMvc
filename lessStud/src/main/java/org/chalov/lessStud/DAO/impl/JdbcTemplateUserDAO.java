package org.chalov.lessStud.DAO.impl;


import org.chalov.lessStud.DAO.UserDAO;
import org.chalov.lessStud.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class JdbcTemplateUserDAO implements UserDAO {
    //  private static Connection conn;
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<User> getAll() {
        return jdbcTemplate.query("select * from users", new BeanPropertyRowMapper<>(User.class)
        );
    }


    public User getOne(String email) {
        return jdbcTemplate.query("select * from users where email = ?",
                new Object[]{email}, new BeanPropertyRowMapper<>(User.class)
        ).stream().findAny().orElse(null);


    }

    public void add(User user) {
        jdbcTemplate.update("insert into users values (?, ?, ?)",
                user.getName(), user.getSurname(), user.getEmail());
    }
}