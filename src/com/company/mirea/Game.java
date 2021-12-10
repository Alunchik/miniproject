package com.company.mirea;

import java.util.Scanner;

public class Game {
   private String name;
   private Scanner scanner = new Scanner(System.in);
   private int question_number = 1;
   private boolean game_over = false;
   private double sredneeTime =0;

   public Game(String name){
       this.name=name;
   }
   public void start() {
       while (game_over == false) {
           Question question = new Question();
           question.print();
           double now = System.nanoTime()/1000000000;
           int c = scanner.nextInt();
           now = System.nanoTime()/1000000000-now;
           sredneeTime =(sredneeTime *(question_number-1)+now)/question_number;
           String formatTime = String.format("%.1f", sredneeTime);
           if (c == question.getEquals()){
               question_number +=1;
           }
           else{
               System.out.printf("Неправильно! \nПоздравляем, %s, ты ответил на %s вопросов и дошел до %s уровня\nСреднее время ответа: %s sec",name, question_number, Generator.getDifficult(), formatTime);
               game_over=true;
           }
           if(question_number%10==0){
               Generator.setDifficult(Generator.getDifficult()+1);
           }
       }
   }
}
