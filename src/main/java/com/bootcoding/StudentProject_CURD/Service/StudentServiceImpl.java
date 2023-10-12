package com.bootcoding.StudentProject_CURD.Service;

import com.bootcoding.StudentProject_CURD.Model.Student;
import com.bootcoding.StudentProject_CURD.Repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.*;
import java.util.List;

@Service

public class StudentServiceImpl implements StudentService{



    @Autowired
    private StudentRepo studentRepo;

    @Override
    public Student getStudent(int rollNumber) {
        return studentRepo.getStudent(rollNumber);
    }

    @Override
    public String insertStudent(Student student) {
        return studentRepo.insertStudent(student);
    }

    @Override
    public List<Student> getAllStudent() {
        return studentRepo.getAllStudent();
    }

    @Override
    public Student updateStudent(int studentId,Student student) {
        return studentRepo.updateStudent(studentId,student);
    }

    @Override
    public String deleteStudent(int studentId, Student student) {
        return studentRepo.deleteStudent(studentId);
    }

    @Override
    public List<Student> getbranch(String branch) {
        return studentRepo.getbranch(branch);
    }

}
