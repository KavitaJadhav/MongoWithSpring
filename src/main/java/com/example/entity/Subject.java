package com.example.entity;

import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

public class Subject {
    @Field(name = "subject_name")
    private String subjectName;

    @Field(name = "mark_obtained")
    private int markObtained;

    public int getMarkObtained() {
        return markObtained;
    }

    public void setMarkObtained(int markObtained) {
        this.markObtained = markObtained;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }
}
