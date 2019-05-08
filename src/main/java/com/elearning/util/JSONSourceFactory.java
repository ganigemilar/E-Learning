package com.elearning.util;

public class JSONSourceFactory extends FactoryObject {
    public static final String ATTR_EXAMS = "exams";

    public static final String ATTR_TYPE = "type";
    public static final String ATTR_QUESTION = "question";
    public static final String ATTR_QUESTION_ANSWER = "questionAnswer";

    //For multiple choice exam
    public static final String VAL_MULTIPLE_VALUE = "multiple_value";
    public static final String ATTR_OPTIONS = "options";
    public static final String ATTR_OPTIONS_POINT = "point";
    public static final String ATTR_OPTIONS_DESC = "desc";

    //For essay exam
    public static final String VAL_ESSAY = "essay";

    //For true and false exam
    public static final String VAL_TRUE_AND_FALSE = "true_and_false";

    private String dataSource;

    public JSONSourceFactory(String dataSource) {
        this.dataSource = dataSource;
    }


}
