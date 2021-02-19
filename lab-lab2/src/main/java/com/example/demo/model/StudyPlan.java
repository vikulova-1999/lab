package com.example.demo.model;

public class StudyPlan {
    private int id;
    private int subject_id;
    private int exam_type_id;


    public StudyPlan (int id, int subject_id, int exam_type_id) {
        this.id = id;
        this.subject_id = subject_id;
        this.exam_type_id = exam_type_id;
    }


    public int getId() { return id;}
    public void setId(int id) {
        this.id = id;
    }

    public int getSubject_id () { return subject_id;}
    public void setSubject_id (int subject_id) {
        this.subject_id = subject_id;
    }

    public int getExam_type_id () { return exam_type_id;}
    public void setExam_type_id (int exam_type_id) {
        this.exam_type_id = exam_type_id;
    }

}
