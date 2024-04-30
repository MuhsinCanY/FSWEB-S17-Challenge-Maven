package com.workintech.spring17challenge.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Grade {

    private Integer coefficient;
    private String note;
}
