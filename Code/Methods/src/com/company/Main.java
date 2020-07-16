package com.company;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        int currentPosition = calculateHighScorePosition(PlayerScore);

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("your final score was "+ highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("your final score was "+ highScore);



    }

    public static int calculateScore(boolean gameOver,int score, int levelCompleted, int bonus) {

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition(char Name, int position){
        System.out.println(Name + " managed get in position" + calculateHighScorePosition());
    }

    public static int calculateHighScorePosition(int PlayerScore) {
        if (PlayerScore > 1000) {
            return 1;
        } else if (PlayerScore > 500 || PlayerScore < 1000) {
            return 2;
        } else if (PlayerScore > 100 || PlayerScore < 500) {
            return 3;
        } else {
            return 4;
        }
    }


}
