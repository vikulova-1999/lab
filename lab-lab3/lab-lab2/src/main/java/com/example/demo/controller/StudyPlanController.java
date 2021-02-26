package com.example.demo.controller;

import com.example.demo.dao.StudyPlanJdbc;
import com.example.demo.model.StudyPlan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudyPlanController {
    private final StudyPlanJdbc studyplanJdbc;
    public StudyPlanController (StudyPlanJdbc studyplanJdbc) {
        this.study_planJdbc = study_planJdbc;
    }


    /*@GetMapping("/studyplan/{id}")
    public StudyPlan getStudyPlan (@PathVariable int id) {
        StudyPlan mark = studyplanJdbc.get(id);
        return studyplan;
    }*/

    @PostMapping("/study_plan") //просмотр группы
    public int set_or_update_study_plan(@RequestBody StudyPlan study_plan)
    {
        return study_planJdbc.set(study_plan.getId(), study_plan.getSubjectId(), study_plan.getExamTypeId());
    }

    @GetMapping("/study_plan/all") //просмотр всех групп
    public List<Student> get_all_study_plan ()
    {
        List<StudyPlan> study_plans = study_planJdbc.get_all();
        return study_plans;
    }

}
