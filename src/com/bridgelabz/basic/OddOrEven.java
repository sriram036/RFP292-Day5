package com.bridgelabz.basic;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int number = scanner.nextInt();
        if (number % 2 == 1) {
            System.out.println("The Number is an Odd Number.");
        }
        else {
            System.out.println("The Number is an Even Number.");
        }
    }
}
