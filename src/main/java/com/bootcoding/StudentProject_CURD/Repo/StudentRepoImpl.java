package com.bootcoding.StudentProject_CURD.Repo;

import com.bootcoding.StudentProject_CURD.Model.Student;
import org.springframework.stereotype.Repository;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class StudentRepoImpl implements StudentRepo{
    private Map<Integer, Student> studentMap = new HashMap<>();

    public String insertStudent(Student student){
        if(studentMap.containsKey(student.getRollNumber())){
            return "student already exist...";
        }
        studentMap.put(student.getRollNumber(),student);
        return "insert successfully...";
    }

    @Override
    public Student getStudent(int rollNumber) {
        return studentMap.get(rollNumber);
    }

    @Override
    public List<Student> getAllStudent() {
        ArrayList<Student>students = new ArrayList<>();
        for(Integer n : studentMap.keySet()){
            students.add(studentMap.get(n));
        }
        return students;
    }

    @Override
    public Student updateStudent(int studentId, Student student) {
        if(studentMap.containsKey(studentId)){
            studentMap.put(studentId,student);
            return student;
        }
        return null;
    }

    public String deleteStudent(int studentId){
        studentMap.remove(studentId);
        return "Student delete successfully....";
    }

    public List<Student> getbranch(String branch) {
        List<Student> students = new ArrayList<>();
        for (int i : studentMap.keySet()){
            if(branch.equals(studentMap.get(i).getBranch())){
                students.add(studentMap.get(i));
            }
        }
        return  students;
    }
}
