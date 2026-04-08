package com.saran.rest_api.controller;

import com.saran.rest_api.model.StudentEntity;
import com.saran.rest_api.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/students")
public class StudentController {
    private final StudentService service;

    public StudentController(StudentService service){
        this.service=service;
    }
    @PostMapping
    public StudentEntity create(@RequestBody StudentEntity student){
        return service.createStudent(student);
    }
    @GetMapping
    public List<StudentEntity> getAll(){
        return service.getAllStudents();
    }
    @GetMapping("/{id}")
    public StudentEntity getById(@PathVariable Long id){
        return service.getStudentById(id);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        service.deleteStudent(id);
    }

}
