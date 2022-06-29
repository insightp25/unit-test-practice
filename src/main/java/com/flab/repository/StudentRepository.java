package com.flab.repository;

import com.flab.model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentRepository {
    List<Student> getAllStudents();
    List<Student> getStudents(String major);
    Optional<Student> getStudent(int id);
}
