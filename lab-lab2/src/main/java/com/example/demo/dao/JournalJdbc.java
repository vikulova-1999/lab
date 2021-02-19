package com.example.demo.dao;


import com.example.demo.model.Journal;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class JournalJdbc {
    private final JdbcTemplate jdbcTemplate;
    public JournalJdbc (JdbcTemplate jdbcTemplate)
    {
        this.jdbcTemplate = jdbcTemplate;
    }


}
