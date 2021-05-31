package com.example.prac_11;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
        Student student = new Student();
        System.out.println(student.Get());
        System.out.println( student.toString());
    }

}
