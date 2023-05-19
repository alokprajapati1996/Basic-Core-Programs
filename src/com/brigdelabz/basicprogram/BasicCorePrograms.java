package com.brigdelabz.basicprogram;

import java.util.Scanner;

public class BasicCorePrograms {
    public static void coinFlip() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of times to flip coin");
        int num = scan.nextInt();
        for (int i = 1; i <= num; i++) {
            if (Math.random() < 0.5) {
                System.out.println("Tails");
            } else {
                System.out.println("Heads");
            }
        }
    }
    public static void leapYear() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter year in four digit");
        int year = scan.nextInt();
        if (year >= 1000) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            {
                System.out.println("Year is Leap year");
            }
            else{
                System.out.println("year is not leap year");
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("core java programs");
        coinFlip();
        leapYear();
    }
}
