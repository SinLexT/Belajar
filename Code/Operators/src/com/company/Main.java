package com.company;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);
        int previosResult = result;
        System.out.println("previousResult = " + previosResult);
        result = result - 1;
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult = " + previosResult);

        result = result * 10;
        System.out.println("2 * 10 = " + result);

        result = result / 5;
        System.out.println("20 / 5 = " + result);

        result = result % 3;
        System.out.println("4 % 3 = " + result);

        boolean isAlien = false;
        if (isAlien == false)
            System.out.println("It is not an alien");

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("greater than second top score and less than 100");
        }

        if ((topScore > 90) ||(secondTopScore <= 90)) {
            System.out.println("either or both of the condition are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("this is true!");
        }

        boolean isCar = false;
        if (!isCar) {
            System.out.println("This is not supposed to happen");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        }
    }
}
