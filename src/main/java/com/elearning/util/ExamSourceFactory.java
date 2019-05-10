package com.elearning.util;

public class ExamSourceFactory {
    public enum Factory {
        JSON_SOURCE_FACTORY
    }

    public static ExamSource getExamSourceFactory(Factory factory) {
        switch (factory) {
            case JSON_SOURCE_FACTORY:
                return new JSONSourceFactory(null);
        }
        return null;
    }
}
