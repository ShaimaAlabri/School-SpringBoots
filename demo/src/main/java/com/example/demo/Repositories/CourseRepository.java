package com.example.demo.Repositories;

import com.example.demo.Models.Course;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
public interface CourseRepository extends JpaRepository<Course, Integer> {

    @Query("SELECT c FROM Course c WHERE c.id =:courseId")
    Course getCourseById(@Param("courseId") Integer id);

    @Query(value = "Select c.name from Course c")
    List<String> getAllCoursesNames();
}
