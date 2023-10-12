package com.bootcoding.StudentProject_CURD.Repo;

import com.bootcoding.StudentProject_CURD.Model.Student;

import javax.swing.*;
import java.util.List;

public interface StudentRepo {

    String insertStudent(Student student);

    Student getStudent(int rollNumber);

    List<Student> getAllStudent();

    Student updateStudent(int studentId, Student student);

    String deleteStudent(int studentId);


    List<Student> getbranch(String branch);

}
