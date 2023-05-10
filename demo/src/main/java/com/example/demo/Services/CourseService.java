package com.example.demo.Services;

import com.example.demo.Models.Course;

import com.example.demo.Repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service

public class CourseService {

    @Autowired
    CourseRepository courseRepository;

    public Course getCourseById(Integer id){
        Course course = courseRepository.getById(id);
        return course;
    }
}
