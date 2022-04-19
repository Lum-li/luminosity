package com.example.importtest2.student;

import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

@Component
@Import(Teacher.class)
public class Student {
    public void printStudent(){
        System.out.println("student");
        System.out.println("新加Student=======================");
    }

}
