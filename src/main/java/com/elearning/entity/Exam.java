package com.elearning.entity;

public abstract class Exam {
    private static int counterNumberExam = 1;

    private int questionNumber;
    private String question;
    private String answer;

    {
        counterNumberExam++;
        questionNumber = counterNumberExam;
    }

    public Exam(String question) {
        this.question = question;
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

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
