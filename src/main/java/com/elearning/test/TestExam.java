package com.elearning.test;

import com.elearning.entity.MultipleChoice;

import java.util.HashSet;
import java.util.Set;

public class TestExam {
    public static void main(String... args) {
        MultipleChoice.Option op1 = new MultipleChoice.Option("g1", "gg");
        MultipleChoice.Option op2 = new MultipleChoice.Option("g1", "gg");

        Set<MultipleChoice.Option> setObj = new HashSet<MultipleChoice.Option>();
        setObj.add(op1);
        setObj.add(op2);

        for (MultipleChoice.Option tmp : setObj) {
            System.out.println(tmp.getOptionPoint());
            System.out.println(tmp.hashCode());
        }

        System.out.println(op2.hashCode());
    }
}
