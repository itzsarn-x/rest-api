package com.saran.rest_api.model;
import jakarta.persistence.*;
@Entity
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String name;
    private int age;
    private String email;
    //no arguments constructor
    public StudentEntity(){

    }
    //arguments constructor
    public StudentEntity(Long Id,String name,int age,String email){
        this.Id=Id;
        this.name=name;
        this.age=age;
        this.email=email;
    }
    //getters and setters
    public Long getId(){
        return Id;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getEmail(){
        return email;
    }

    public void setId(Long Id){
        this.Id=Id;
    }
    public void setName(String Name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setEmail(String Email){
        this.email=email;
    }
}
