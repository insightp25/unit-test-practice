package com.flab.model;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class Student {
    private int id;
    private String name;
    private String major;
    private List<Course> courses;
}
