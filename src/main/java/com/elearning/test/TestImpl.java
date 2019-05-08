package com.elearning.test;

public class TestImpl implements Test {
    public void process(String name) {
        System.out.println(String.format("Nama saya %s", name));
    }
}
