package com.elearning.util;

import com.elearning.entity.Essay;
import com.elearning.entity.Exam;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import com.elearning.entity.MultipleChoice;
import com.elearning.entity.TrueAndFalse;
import org.json.simple.*;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONSourceFactory implements ExamSource {
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

    private FileReader examSourceFile;

    private String[] fileNames;


    public JSONSourceFactory(FileReader examSourceFile) {
        this.examSourceFile = examSourceFile;
    }

    public List<Exam> getListExams() {
        return parse();
    }

    public void initFile(String[] fileNames) {
        this.fileNames = fileNames;
    }

    public void initFile(String fileName) {
        fileNames = new String[]{fileName};
    }

    private List<Exam> parse() {
        if (examSourceFile == null)
            return null;

        List<Exam> listExams = null;

        try {
            Object parser = new JSONParser().parse(examSourceFile);
            JSONObject jsonObject = (JSONObject) parser;

            Map dataExams = (Map) jsonObject.get(ATTR_EXAMS);
            Iterator<Map> iterDataExams = dataExams.entrySet().iterator();
            while (iterDataExams.hasNext()) {
                Exam exam = null;

                Map pairExam = iterDataExams.next();
                String type = (String) pairExam.get(ATTR_TYPE);
                String question = (String) pairExam.get(ATTR_QUESTION);
                String questionAnswer = (String) pairExam.get(ATTR_QUESTION_ANSWER);

                if (VAL_MULTIPLE_VALUE.equals(type)) {
                    Iterator<Map> iterOptions = ((Map) pairExam.get(ATTR_OPTIONS)).entrySet().iterator();

                    while (iterOptions.hasNext()) {
                        Map pairOption = iterOptions.next();
                        String optionPoint = (String) pairOption.get(ATTR_OPTIONS_POINT);
                        String optionDesc = (String) pairOption.get(ATTR_OPTIONS_DESC);

                        HashMap<String, MultipleChoice.Option> mapOptions = new HashMap<String, MultipleChoice.Option>();
                        mapOptions.put(optionPoint, new MultipleChoice.Option(optionPoint, optionDesc));

                        exam = new MultipleChoice(question, mapOptions);
                        exam.setQuestionAnswer(questionAnswer);

                        listExams.add(exam);
                    }

                } else if (VAL_ESSAY.equals(type)) {
                    exam = new Essay(question);
                    exam.setQuestionAnswer(questionAnswer);

                    listExams.add(exam);

                } else if (VAL_TRUE_AND_FALSE.equals(type)) {
                    exam = new TrueAndFalse(question);
                    exam.setQuestionAnswer(questionAnswer);

                    listExams.add(exam);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return listExams;
    }
}
