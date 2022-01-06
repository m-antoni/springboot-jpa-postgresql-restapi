package com.application.springbootpostgresqlapi.service;

import com.application.springbootpostgresqlapi.model.Student;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents(){
        return List.of(
                new Student(
                        1L,
                        "Michael Antoni",
                        32, "michaelantoni.cs@gmail.com",
                        LocalDate.of(1989, 02, 21)
                ),
                new Student(
                        1L,
                        "Sebastian Noah Antoni",
                        1, "sebastian@gmail.com",
                        LocalDate.of(2020, 04, 30)
                )
        );
    }
}
