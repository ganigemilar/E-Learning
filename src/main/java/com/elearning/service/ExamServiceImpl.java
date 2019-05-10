package com.elearning.service;

import com.elearning.util.ExamSource;
import com.elearning.util.ExamSourceFactory;
import com.elearning.util.ExamSourceFactory.Factory;

public class ExamServiceImpl implements ExamService {
    private ExamSource examSource = ExamSourceFactory.getExamSourceFactory(Factory.JSON_SOURCE_FACTORY);

    public void onCreateExam(Object... objects) {

    }

    public void onProcessMarking(Object... objects) {

    }
}
