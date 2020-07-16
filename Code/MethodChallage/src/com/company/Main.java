package com.company;

import javax.swing.*;
import java.lang.management.PlatformLoggingMXBean;

public class Main {

    public static void main(String[] args) {
        int PlayerScore = 1500;
        String Name = "Deb";
        int Position = calculateHighScorePosition(PlayerScore);


        calculateHighScorePosition(PlayerScore);
        displayHighScorePosition(Name, Position);

        PlayerScore = 900;
        Position = calculateHighScorePosition(PlayerScore);

        calculateHighScorePosition(PlayerScore);
        displayHighScorePosition(Name, Position);

        PlayerScore = 400;
        Position = calculateHighScorePosition(PlayerScore);

        calculateHighScorePosition(PlayerScore);
        displayHighScorePosition(Name, Position);

        PlayerScore = 50;
        Position = calculateHighScorePosition(PlayerScore);

        calculateHighScorePosition(PlayerScore);
        displayHighScorePosition(Name, Position);

    }
    public static void displayHighScorePosition(String Name, int Position){
        System.out.println(Name + " managed get in position " + Position + " on the high score table");
    }

    public static int calculateHighScorePosition(int PlayerScore) {
        if (PlayerScore >= 1000) {
            return 1;
        } else if (PlayerScore >= 500) {
            return 2;
        } else if (PlayerScore >= 100) {
            return 3;
        } else {
            return 4;
        }
    }
}
