package com.bridgelabz.basic;

import java.util.Scanner;

public class LargestAmongThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number 1 :");
        int number1 = scanner.nextInt();
        System.out.println("Enter Number 2 :");
        int number2 = scanner.nextInt();
        System.out.println("Enter Number 3 :");
        int number3 = scanner.nextInt();
        if (number1 > number2 && number1 > number3) {
            System.out.println("The Number " + number1 + " is the largest number.");
        }
        else if (number2 > number1 && number2 > number3) {
            System.out.println("The Number " + number2 + " is the largest number.");
        }
        else {
            System.out.println("The Number " + number3 + " is the largest number.");
        }
    }
}
