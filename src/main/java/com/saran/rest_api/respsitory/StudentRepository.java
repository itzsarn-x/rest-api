package com.saran.rest_api.respsitory;
import  com.saran.rest_api.model.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentEntity, Long> {

}
