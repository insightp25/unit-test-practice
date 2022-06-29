package com.flab.repository;

import com.flab.model.Score;

import java.util.Map;
import java.util.Optional;

public interface ScoreRepository {
    Map<Integer, Score> getScores(int courseID);
    Optional<Score> getScore(int studentID, int courseID);
}
