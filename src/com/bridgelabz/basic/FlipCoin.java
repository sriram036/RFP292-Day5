package com.bridgelabz.basic;

import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        int headCount = 0;
        int tailCount = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number time the coin need to be flipped :");
        int num = scanner.nextInt();
        if (num <= 0) {
            System.out.println("Please Enter Positive Number!");
        }
        else {
            for (int i = 0; i < num; i++) {
                int flipCoin = (int)(Math.random()*10)%2;
                if (flipCoin == 0){
                    headCount++;
                    System.out.println("Head Count "+headCount);
                }
                else {
                    tailCount++;
                    System.out.println("tail count " + tailCount);
                }
            }
            float heads = (float) headCount / num;
            float tails = (float) tailCount / num;
            System.out.println("The Percentage of heads is " + heads * 100);
            System.out.println("The Percentage of tails is " + tails * 100);
        }
    }
}
