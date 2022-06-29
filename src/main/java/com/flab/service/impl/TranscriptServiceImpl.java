package com.flab.service.impl;

import com.flab.exception.NoSuchCourseException;
import com.flab.exception.NoSuchScoreException;
import com.flab.exception.NoSuchStudentException;
import com.flab.model.Course;
import com.flab.model.Score;
import com.flab.model.Student;
import com.flab.repository.CourseRepository;
import com.flab.repository.ScoreRepository;
import com.flab.repository.StudentRepository;
import com.flab.service.TranscriptService;
import lombok.RequiredArgsConstructor;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public class TranscriptServiceImpl implements TranscriptService {

    private final CourseRepository courseRepository;
    private final ScoreRepository scoreRepository;
    private final StudentRepository studentRepository;

    @Override
    public double getAverageScore(int studentID) {
        final Student student = studentRepository.getStudent(studentID)
                .orElseThrow(NoSuchStudentException::new);
        final List<Score> scores = student.getCourses()
                .stream()
                .map(Course::getId)
                .map(courseID -> scoreRepository.getScore(studentID, courseID))
                .map(maybeScore -> maybeScore.orElseThrow(NoSuchScoreException::new))
                .collect(Collectors.toList());

        return scores.stream()
                .collect(Collectors.averagingInt(Score::getScore));
    }

    @Override
    public List<Student> getRankedStudentsAsc(int courseID) {
        final Course course = courseRepository.getCourse(courseID)
                .orElseThrow(NoSuchCourseException::new);
        final Map<Integer, Score> studentIDToScore = scoreRepository.getScores(course.getId());
        final List<Student> assignedStudents = studentRepository.getAllStudents()
                .stream()
                .filter(student -> studentIDToScore.containsKey(student.getId()))
                .collect(Collectors.toList());

        return assignedStudents.stream()
                .sorted(Comparator.<Student>comparingInt(student -> studentIDToScore.get(student.getId()).getScore()).reversed())
                .collect(Collectors.toList());
    }
}
