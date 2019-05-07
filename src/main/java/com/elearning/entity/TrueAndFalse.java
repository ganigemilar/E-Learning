package com.elearning.entity;

public class TrueAndFalse extends Exam {
    private boolean isTrueChoiced;
    private boolean isFalseChoiced;

    public TrueAndFalse(String question) {
        super(question);
    }

    public boolean isTrueChoiced() {
        return isTrueChoiced;
    }

    public void setTrueChoiced(boolean trueChoiced) {
        isTrueChoiced = trueChoiced;
    }

    public boolean isFalseChoiced() {
        return isFalseChoiced;
    }

    public void setFalseChoiced(boolean falseChoiced) {
        isFalseChoiced = falseChoiced;
    }
}
