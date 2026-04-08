package com.saran.rest_api.service;

import com.saran.rest_api.model.StudentEntity;
import com.saran.rest_api.respsitory.StudentRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    private final StudentRepository repository;

    public StudentService(StudentRepository repository){
        this.repository=repository;
    }

    public StudentEntity createStudent(StudentEntity student){
        return repository.save(student);
    }

    public List<StudentEntity> getAllStudents(){
        return repository.findAll();
    }
    public StudentEntity getStudentById(Long Id){
        return repository.findById(Id).orElseThrow(()->new RuntimeException("Student not found"));
    }
    public void deleteStudent(Long Id){
        repository.deleteById(Id);
    }
}
