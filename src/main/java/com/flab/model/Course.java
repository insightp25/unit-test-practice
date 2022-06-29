package com.flab.model;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Course {
    private int id;
    private String name;
    private String description;
}
