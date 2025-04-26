package com.chaithra.api.controller;

import com.chaithra.api.entity.Student;
import com.chaithra.api.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/getAllStudents")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public Student getStudentByIdPath(@PathVariable Integer id) {
        return studentService.getStudentById(id);
    }

    @GetMapping
    public Student getStudentByIdRequestParam(@RequestParam Integer id) {
        return studentService.getStudentById(id);
    }



}
