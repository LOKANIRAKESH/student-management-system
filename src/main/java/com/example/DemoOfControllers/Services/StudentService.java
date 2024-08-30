package com.example.DemoOfControllers.Services;
import com.example.DemoOfControllers.model.Student;
import com.example.DemoOfControllers.repository.StudentRepo;
import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepo studentRepo;
    public List<Student> getStudents()
    {
        return studentRepo.findAll();
    }
    public Student getById(int stuid) {
        return studentRepo.findById(stuid).orElse(null);
    }
    public void addStudent(Student student)
    {
        studentRepo.save(student);
    }

    public void updateStudent(Student student,int stuid) {

        studentRepo.save(student);
    }

    public void deleteStudent(int stuid) {
        studentRepo.deleteById(stuid);
    }
}
