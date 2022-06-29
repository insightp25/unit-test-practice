package com.flab.service;

import com.flab.model.Student;

import java.util.List;

public interface TranscriptService {
    double getAverageScore(int studentID);
    List<Student> getRankedStudentsAsc(int courseID);
}
