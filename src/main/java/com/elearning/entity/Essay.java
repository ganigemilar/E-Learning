package com.elearning.entity;

public class Essay extends Exam {
    private static int totalQuestion = 1;

    private String answer;

    public Essay() {
        super(ExamType.ESSAY);
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
