package com.naveen.repository;

import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.List;
import java.util.Optional;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.naveen.constants.SqlQueries;
import com.naveen.entity.User;

@Repository
public class UserRepository {
	
    private final JdbcTemplate jdbcTemplate;

    private final RowMapper<User> userRowMapper = (rs, rowNum) -> {
        User user = new User();
        user.setId(rs.getInt("id"));
        user.setName(rs.getString("name"));
        user.setEmail(rs.getString("email"));
        return user;
    };

    public UserRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<User> findAll() {
        return jdbcTemplate.query(SqlQueries.SELECT_ALL_USERS, userRowMapper);
    }

    public Optional<User> findById(Integer id) {
        try {
            User user = jdbcTemplate.queryForObject(SqlQueries.SELECT_USER_BY_ID, new Object[]{id}, userRowMapper);
            return Optional.ofNullable(user);
        } catch (Exception e) {
            return Optional.empty();
        }
    }

    public User save(User user) {
        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(connection -> {
            PreparedStatement ps = connection.prepareStatement(SqlQueries.INSERT_USER, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, user.getName());
            ps.setString(2, user.getEmail());
            return ps;
        }, keyHolder);

        user.setId(keyHolder.getKey().intValue());
        return user;
    }

    public int update(User user) {
        return jdbcTemplate.update(SqlQueries.UPDATE_USER, user.getName(), user.getEmail(), user.getId());
    }

    public int deleteById(Integer id) {
        return jdbcTemplate.update(SqlQueries.DELETE_USER, id);
    }
}