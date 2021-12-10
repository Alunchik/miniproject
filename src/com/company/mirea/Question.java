package com.company.mirea;

import java.util.Random;

public class Question {
    Generator generator = new Generator();
    private int a = generator.generateNum();
    private int b = generator.generateNum();
    private int equals = a+b;

    public int getEquals() {
        return equals;
    }
    public void print(){
        System.out.println( a + " + " + b + " = ");
    }
}
