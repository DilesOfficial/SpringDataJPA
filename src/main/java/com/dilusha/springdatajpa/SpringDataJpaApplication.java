package com.dilusha.springdatajpa;

import com.dilusha.springdatajpa.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class SpringDataJpaApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringDataJpaApplication.class, args);

        StudentRepo repo = context.getBean(StudentRepo.class);

        Student s1 = context.getBean(Student.class);
        Student s2 = context.getBean(Student.class);
        Student s3 = context.getBean(Student.class);
        Student s4 = context.getBean(Student.class);

//        s1.setRollNo(100);
//        s1.setName("Dilusha");
//        s1.setMark(92);
//
//        s2.setRollNo(101);
//        s2.setName("Kamal");
//        s2.setMark(82);
//
//        s3.setRollNo(102);
//        s3.setName("Hashan");
//        s3.setMark(79);
//
//        repo.save(s1);
//        repo.save(s2);
//        repo.save(s3);

//        s4.setRollNo(103);
//        s4.setName("Nimal");
//        s4.setMark(76);

        // Update Data
        //repo.save(s4);

        // Delete Data
        repo.delete(s4);

    }

}
