package com.flab.model;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Score {
    private Course course;
    private int score;
}
