package com.example.demo.dao;

import com.example.demo.model.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class StudentJdbc
{
    private final JdbcTemplate jdbcTemplate;
    public StudentJdbc (JdbcTemplate jdbcTemplate)
    {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Student get(int id)
    {
        return jdbcTemplate.queryForObject("SELECT * FROM mark WHERE id = ?", this::mapStudent, id);
    }

    private Student mapStudent(ResultSet rs, int i) throws SQLException*/
    {
        Student student = new Student(
                rs.getInt("id"),
                rs.getString("surname"),
                rs.getString("name"),
                rs.getString("second_name"),
                rs.getInt("study_group_id")
        );

        return student;
    }




public Student search(String student)
    {
        return jdbcTemplate.queryForObject("SELECT * FROM mark WHERE name = ?", Student.class, student);
    }
}