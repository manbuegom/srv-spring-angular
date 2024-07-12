package com.manbuegom.srv_backend.controller;

import com.manbuegom.srv_backend.model.Teacher;
import com.manbuegom.srv_backend.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/v1")
public class TeacherController {

    @Autowired
    private TeacherRepository teacherRepository;

    @GetMapping("/teachers")
    public List<Teacher> getAllTeachers(){
        return teacherRepository.findAll();
    }

    @PostMapping("/teachers")
    public Teacher createTeacher(@RequestBody Teacher teacher) {
        return teacherRepository.save(teacher);
    }
}
