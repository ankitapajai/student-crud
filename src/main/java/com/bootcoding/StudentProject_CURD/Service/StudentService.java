package com.bootcoding.StudentProject_CURD.Service;

import com.bootcoding.StudentProject_CURD.Model.Student;

import javax.swing.*;
import java.util.List;

public interface StudentService {

      Student getStudent(int rollNumber);


    String insertStudent(Student student);

    List<Student> getAllStudent();

    Student updateStudent(int studentId,Student student);

    String deleteStudent(int studentId,Student student);

    List<Student> getbranch(String branch);

}

