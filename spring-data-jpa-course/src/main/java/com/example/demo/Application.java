package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class    Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
        @Bean
        CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args ->{
            Student maria = new Student(
                    "Rassim",
                    "Hashmi",
                    "rassim@saintgobain.com",
                    26
            );

            Student rassim = new Student(
                    "Vinayak",
                    "Thapar",
                    "Vinayak@saintgobain.com",
                    26
            );
            studentRepository.save(maria);

        };
        }
}
