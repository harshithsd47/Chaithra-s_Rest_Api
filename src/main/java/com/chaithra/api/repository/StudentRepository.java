package com.chaithra.api.repository;

import com.chaithra.api.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {


    @Query(value = "SELECT * FROM student WHERE name = ?1", nativeQuery = true)
    public Student findByName(String name);

    @Query("SELECT s FROM Student s WHERE s.age = ?1")
    public List<Student> findByAge(int age);


}