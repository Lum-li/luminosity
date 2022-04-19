package com.example.importtest2;

import com.example.importtest2.student.Student;
import com.example.importtest2.student.Teacher;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ImportTest2Application {

    public static void main(String[] args) {

        ConfigurableApplicationContext config =SpringApplication.run(ImportTest2Application.class);

        Teacher teacher = config.getBean(Teacher.class);
        teacher.printTeacher();
    }

}
