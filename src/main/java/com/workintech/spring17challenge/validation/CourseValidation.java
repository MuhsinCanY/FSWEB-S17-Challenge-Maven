package com.workintech.spring17challenge.validation;

import com.workintech.spring17challenge.exceptions.ApiException;
import org.springframework.http.HttpStatus;

public class CourseValidation {

    public static void checkName(String name) {
        if (name == null || name.isBlank()) {
            throw new ApiException("name cannot be null or empty! " + name, HttpStatus.BAD_REQUEST);
        }
    }

    public static void checkCredit(Integer credit) {
        if (credit == null || credit < 0 || credit > 4) {
            throw new ApiException("credit is null or not between 0-4! " + credit,
                    HttpStatus.BAD_REQUEST);
        }
    }

    public static void checkId(Integer id) {

        if (id == null || id < 0) {
            throw new ApiException("id cannot be null or less then zero! " + id,
                    HttpStatus.BAD_REQUEST);
        }

    }
}
