package com.dilusha.springdatajpa;

import com.dilusha.springdatajpa.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {


    List<Student> findByName(String name);

    List<Student> findByMark(int mark);

    List<Student> findByMarkGreaterThan(int mark);
}
