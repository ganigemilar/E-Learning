package com.elearning.service;

import com.elearning.util.FactoryObject;

public class ExamSourceFactoryImpl implements ExamSourceFactory {
    public static final String ATTR_EXAMS = "exams";
    public static final String ATTR_QUESTION = "question";

    public static final String ATTR_MULTIPLE_VALUE = "multipleValue";
    public static final String ATTR_OPTIONS = "options";
    public static final String ATTR_OPTION = "option";

    private FactoryObject factoryObject;

    public ExamSourceFactoryImpl(FactoryObject factoryObject) {
        this.factoryObject = factoryObject;
    }

    public void onProcess(Object... objects) {

    }
}
