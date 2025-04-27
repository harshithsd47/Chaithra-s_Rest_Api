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

    @GetMapping("/getStudentById/{id}")
    public Student getStudentByIdPath(@PathVariable Integer id) {
        return studentService.getStudentById(id);
    }

    @GetMapping("/getStudentById")
    public Student getStudentByIdRequestParam(@RequestParam Integer id) {
        return studentService.getStudentById(id);
    }

    @PostMapping("/saveStudent")
    public Student saveStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    @PostMapping("/saveStudents")
    public List<Student> saveStudents(@RequestBody List<Student> students) {
        return studentService.saveStudents(students);
    }

    @GetMapping("/getStudentByName")
    public Student getStudentByName(@RequestParam String name) {
        return studentService.getStudentByName(name);
    }

    @GetMapping("/getStudentByAge")
    public List<Student> getStudentByAge(@RequestParam int age) {
        return studentService.getStudentByAge(age);
    }

}
