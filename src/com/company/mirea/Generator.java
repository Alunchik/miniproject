package com.company.mirea;

import java.util.Random;

public class Generator{
    Random rand = new Random();
    private static int difficult = 1;

    public int generateNum() {
        int num = rand.nextInt(10*(int)Math.pow(10, difficult-1));
        return num;
    }

    public static int getDifficult() {
        return difficult;
    }

    public static void setDifficult(int difficult) {
        Generator.difficult = difficult;
    }
}
