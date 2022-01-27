package com.application.springbootpostgresqlapi.controller;

import com.application.springbootpostgresqlapi.model.Student;
import com.application.springbootpostgresqlapi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/v1/students")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getStudents(){
        return studentService.getStudents();
    }

    @GetMapping(path = "{id}")
    public Optional<Student> getSingleStudent(@PathVariable("id")  Long id){
        return studentService.getSingleStudent(id);
    }

    @PostMapping
    public void createStudent(@RequestBody Student student){
        studentService.createStudent(student);
    }

    @DeleteMapping(path = "{id}")
    public void deleteStudent(@PathVariable("id") Long id){
        studentService.deleteStudent(id);
    }

    @PutMapping(path = "{id}")
    public void updateStudent(@PathVariable("id") Long id, @RequestBody Student student){
        studentService.updateStudent(id, student);
    }
}
