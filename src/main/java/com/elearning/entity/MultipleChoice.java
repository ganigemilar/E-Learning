package com.elearning.entity;

import java.util.Map;

public class MultipleChoice extends Exam {
    private Map<String, Option> mapOptions;

    public MultipleChoice(String question, Map<String, Option> mapOptions) {
        super(question);
        this.mapOptions = mapOptions;
    }

    public Map<String, Option> getMapOptions() {
        return mapOptions;
    }

    public static class Option {
        private String optionPoint;
        private String optionDescription;
        private boolean isAnswered;

        public Option(String optionPoint, String optionDescription) {
            this.optionPoint = optionPoint;
            this.optionDescription = optionDescription;
        }

        public String getOptionPoint() {
            return optionPoint;
        }

        public void setOptionPoint(String optionPoint) {
            this.optionPoint = optionPoint;
        }

        public String getOptionDescription() {
            return optionDescription;
        }

        public void setOptionDescription(String optionDescription) {
            this.optionDescription = optionDescription;
        }

        public boolean isAnswered() {
            return isAnswered;
        }

        public void setAnswered(boolean answered) {
            isAnswered = answered;
        }
    }
}
