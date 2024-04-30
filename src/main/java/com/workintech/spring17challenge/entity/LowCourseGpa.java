package com.workintech.spring17challenge.entity;

import org.springframework.stereotype.Controller;

@Controller
public class LowCourseGpa implements CourseGpa {
    @Override
    public int getGpa() {
        return 3;
    }
}
