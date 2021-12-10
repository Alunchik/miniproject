package com.company.mirea;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter your name!");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        Game game = new Game(name);
        game.start();
    }
}
