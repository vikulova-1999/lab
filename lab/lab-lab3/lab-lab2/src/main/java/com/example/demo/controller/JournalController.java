package com.example.demo.controller;

import com.example.demo.dao.JournalJdbc;
import com.example.demo.model.Journal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JournalController {
    private final JournalJdbc journalJdbc;
    public MarkController (JournalJdbc journalJdbc) {
        this.journalJdbc = journalJdbc;
    }

    @GetMapping("/journal/{id}") //просмотр записей журнала
    public Journal getJournal (@PathVariable int id) {
        Journal journal = journalJdbc.get(id);
        return journal;
    }

    @GetMapping("/journal/student/{id}") //просмотр записей журнала по студенту
    public List<Journal> get_all_student (@PathVariable int id)
    {
        List<Journal> journals = journalJdbc.get_all_group(id);
        return journals;
    }

    @GetMapping("/journal/group/{id}") //просмотр записей журнала по группе
    public List<Journal> get_all_group (@PathVariable int id)
    {
        List<Journal> journals = journalJdbc.get_all_group(id);
        return journals;
    }




}
