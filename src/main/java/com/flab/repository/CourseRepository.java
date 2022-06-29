package com.flab.repository;

import com.flab.model.Course;

import java.util.List;
import java.util.Optional;

public interface CourseRepository {
    List<Course> getAllCourses();
    Optional<Course> getCourse(int id);
    Optional<Course> getCourse(String name);
}
