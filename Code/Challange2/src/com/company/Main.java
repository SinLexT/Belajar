package com.company;

public class Main {

    public static void main(String[] args) {

        double firstValue = 20.00;
        double secondValue = 80.00;
        double thirdValue = (firstValue + secondValue) * 100.00;
        System.out.println(thirdValue);
        double fourthValue = thirdValue % 40.00;
        System.out.println(fourthValue);
        boolean theValue = fourthValue > 0 ? true : false;
        System.out.println("The value is " + theValue);
        if (theValue) {
            System.out.println("We got some reminder!");
        }


    }
}
