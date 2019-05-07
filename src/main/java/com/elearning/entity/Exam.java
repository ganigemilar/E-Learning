package com.elearning.entity;

public abstract class Exam {
    private static int counterNumberExam = 1;

    public enum ExamType {
        MULTIPLE_CHOICE,
        ESSAY,
        TRUE_AND_FALSE
    }

    private ExamType type;
    private String question;
    private int questionNumber;

    {
        counterNumberExam++;
        questionNumber = counterNumberExam;
    }

    public Exam(ExamType type) {
        this.type = type;
    }

    public ExamType getType() {
        return type;
    }

    public int getQuestionNumber() {
        return questionNumber;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
}
