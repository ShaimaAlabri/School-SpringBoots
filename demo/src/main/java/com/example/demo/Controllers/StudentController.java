package com.example.demo.Controllers;

import com.example.demo.Models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "student")
public class StudentController {
    @Autowired
    StudentService studentService;

    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Student> getAllStudents() {
        List<Student> studentList = studentService.getAllStudents();
        return studentList;
    }

    @RequestMapping(value = "getBySchoolName", method = RequestMethod.GET)
    public List<Student> getStudentsBySchoolName(@RequestParam String schoolName) {
        return studentService.getStudentsBySchoolName(schoolName);
    }
}
