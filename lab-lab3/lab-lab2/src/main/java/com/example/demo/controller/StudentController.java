package com.example.demo.controller;

import com.example.demo.dao.StudentJdbc;
import com.example.demo.model.Student;
import org.springframework.web.bind.annotation.*;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController
{
    private final StudentJdbc studentJdbc;
    public StudentController(StudentJdbc studentJdbc) {this.studentJdbc = studentJdbc;}

    @GetMapping("/student/{id}") //создание студента
    public Student get_student (@PathVariable int id)
    {
        Student student = studentJdbc.get_student(id);
        return student;
    }

    @PostMapping("/student") //просмотр студента
    public int set_or_update_student(@RequestBody Student student)
    {
        return studentJdbc.set(student.getId(), student.getSurname(), student.getName(), student.getSecond_name(), student.getStudy_group_id());
    }

    @GetMapping("/student/all") //просмотр всех студентов
    public List<Student> get_all_student ()
    {
        List<Student> students = studentJdbc.get_all();
        return students;
    }

    @GetMapping("/student/group/{id}") //просмотр всех студентов по группе
    public List<Student> get_all_student_group (@PathVariable int id)
    {
        List<Student> students = studentJdbc.get_all_group(id);
        return students;
    }

    @GetMapping("/student/delete/{id}") //удаление студента
    public int delete_student (@PathVariable int id)
    {
        int student = studentJdbc.delete(id);
        return student;
    }
}