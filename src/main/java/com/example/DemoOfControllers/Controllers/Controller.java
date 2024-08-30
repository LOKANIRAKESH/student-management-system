package com.example.DemoOfControllers.Controllers;
import com.example.DemoOfControllers.model.Student;
import com.example.DemoOfControllers.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    StudentService studentService;
    @GetMapping("/students")
    public List<Student> getStudents()
    {
        return studentService.getStudents();
    }
    @GetMapping("/students/{id}")
    public Student getById(@PathVariable int id)
    {
        return studentService.getById(id);
    }
    @PostMapping("/students")
    public void addDetails(@RequestBody  Student det)
    {
        studentService.addStudent(det);
    }
    @PutMapping("/students/{stuid}")
    public void updateDetails(@PathVariable int stuid,@RequestBody Student student)
    {
        studentService.updateStudent(student,stuid);
    }
    @DeleteMapping("/students/{stuid}")
    public void delete(@PathVariable  int stuid)
    {
        studentService.deleteStudent(stuid);
    }
}
