package com.example.day21excersice.Repository;

import com.example.day21excersice.Model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,Integer> {
    Course findCourseById(Integer id);


}
