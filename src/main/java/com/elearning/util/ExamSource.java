package com.elearning.util;

import com.elearning.entity.Exam;

import java.util.List;

public interface ExamSource {
    List<Exam> getListExams();

    void initFile(String[] fileNames);

    void initFile(String fileName);
}
