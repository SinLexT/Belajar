package com.company;

public class Main {

    public static void main(String[] args) {
        byte MyChallangeByte = 120;
        short MyChallangeShort = 3200;
        int MyChallangeInt = 210000;
        long MyChallangeLong = 50000L + 10L * (MyChallangeByte + MyChallangeInt + MyChallangeShort);
        System.out.println("Sum of Long = " + MyChallangeLong);
    }
}
