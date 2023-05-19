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
    public static void main(String[] args) {
        System.out.println("core java programs");
        coinFlip();
    }
}
