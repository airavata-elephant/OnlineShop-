package com.stahovskyi.onlineshop.dao.jdbc.mapper;

import com.stahovskyi.onlineshop.entity.User;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRowMapper {

    public User mapRow(ResultSet resultSet) throws SQLException {
        String username = resultSet.getString("user_name");
        String password = resultSet.getString("hashed_password");
        String salt = resultSet.getString("salt");

        return User.builder()
                .userName(username)
                .hashedPassword(password)
                .salt(salt)
                .build();
    }
}
