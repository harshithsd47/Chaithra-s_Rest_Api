package com.chaithra.api.service;

import com.chaithra.api.entity.Student;
import com.chaithra.api.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student getStudentById(Integer id) {
        return studentRepository.findById(id).get();
    }

    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> saveStudents(List<Student> students) {
        return studentRepository.saveAll(students);
    }

    public Student getStudentByName(String name) {
        return studentRepository.findByName(name);
    }

    public List<Student> getStudentByAge(int age) {
        return studentRepository.findByAge(age);
    }

}
