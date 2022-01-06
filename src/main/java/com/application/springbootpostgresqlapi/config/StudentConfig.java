package com.application.springbootpostgresqlapi.config;

import com.application.springbootpostgresqlapi.model.Student;
import com.application.springbootpostgresqlapi.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
            Student michael = new Student(
                        "Michael Antoni",
                        32, "michaelantoni.cs@gmail.com",
                        LocalDate.of(1989, 02, 21)
                );
            Student noah = new Student(
                        "Sebastian Noah Antoni",
                        1, "sebastian@gmail.com",
                        LocalDate.of(2020, 04, 30)
                );

            studentRepository.saveAll(List.of(michael, noah));
        };
    }
}
