package com.elearning.entity;

import java.util.HashMap;
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
        private String optionPoin;
        private String optionDescription;
        private boolean isAnswered;

        public Option(String optionPoin, String optionDescription) {
            this.optionPoin = optionPoin;
            this.optionDescription = optionDescription;
        }

        public String getOptionPoin() {
            return optionPoin;
        }

        public void setOptionPoin(String optionPoin) {
            this.optionPoin = optionPoin;
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
