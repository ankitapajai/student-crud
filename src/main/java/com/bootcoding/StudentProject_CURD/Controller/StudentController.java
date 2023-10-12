package com.bootcoding.StudentProject_CURD.Controller;

import com.bootcoding.StudentProject_CURD.Model.Student;
import com.bootcoding.StudentProject_CURD.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.*;
import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/student")
        public String insertStudent(@RequestBody Student student){
            return studentService.insertStudent(student);

    }

    @GetMapping("/student/{rollNumber}")
    public Student getStudent(@PathVariable int rollNumber){
        return studentService.getStudent(rollNumber);
    }

    @GetMapping("/student")
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }

    //update the records....
    @PutMapping("/student/{studentId}")
    public Student updateStudent(@PathVariable int studentId, Student student){
        return studentService.updateStudent(studentId, student);
    }

    //delete the records...
    @DeleteMapping("/student/{studentId}")
    public String deleteStudent(@PathVariable int studentId,Student student){
        return studentService.deleteStudent(studentId,student);
    }

    @GetMapping("/student/branch/{branch}")
    public List<Student> getBranch(@PathVariable String branch){
        return studentService.getbranch(branch);
    }

}

