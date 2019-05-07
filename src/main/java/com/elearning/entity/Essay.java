package com.elearning.entity;

public class Essay extends Exam {
    private String answer;

    public Essay(String question) {
        super(question);
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
