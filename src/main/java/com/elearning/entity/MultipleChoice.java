package com.elearning.entity;

import java.util.HashMap;
import java.util.Map;

public class MultipleChoice extends Exam {
    private static int totalQuestion = 1;

    private String[] choices;
    private Map<String, Boolean> choiceAnswered = new HashMap<String, Boolean>();

    {
        totalQuestion++;
    }

    public MultipleChoice(String question, String[] choices) {
        super(ExamType.MULTIPLE_CHOICE);
        setQuestion(question);

        this.choices = choices;

        initExam();
    }

    private void initExam() {
        for (String choice : choices) {
            choiceAnswered.put(choice, false);
        }
    }

    public Map<String, Boolean> getChoiceAnswered() {
        return choiceAnswered;
    }

    public String[] getChoices() {
        return choices;
    }

    public static int getTotalQuestion() {
        return totalQuestion;
    }
}
