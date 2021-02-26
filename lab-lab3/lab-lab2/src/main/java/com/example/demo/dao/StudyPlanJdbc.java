package com.example.demo.dao;

import com.example.demo.model.StudyPlan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class StudyPlanJdbc
{
    private final JdbcTemplate jdbcTemplate;
    public StudyPlanJdbc (JdbcTemplate jdbcTemplate)
    {
        this.jdbcTemplate = jdbcTemplate;
    }

    public StudyPlan get(int id)
    {
       return jdbcTemplate.queryForObject("SELECT * FROM mark WHERE id = ?", this::mapStudyPlan, id);
    }

    private StudyPlan mapStudyPlan(ResultSet rs, int i) throws SQLException
    {
        StudyPlan study_plan = new StudyPlan(
                rs.getInt("id"),
                rs.getInt("subject_id"),
                rs.getInt("exam_type_id")
        );

        return study_plan;
    }

    public StudyPlan search(String study_plan)
    {
        return jdbcTemplate.queryForObject("SELECT * FROM mark WHERE name = ?", StudyPlan.class, study_plan);
    }
}