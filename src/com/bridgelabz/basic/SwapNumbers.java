package com.bridgelabz.basic;

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number :");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter Second Number :");
        int secondNumber = scanner.nextInt();
        int temp = 0;
        System.out.println("Before Swapping ...");
        System.out.println("The First Number is " + firstNumber);
        System.out.println("The Second Number is " + secondNumber);
        firstNumber = temp;
        firstNumber = secondNumber;
        secondNumber = firstNumber;
        System.out.println("After Swapping ...");
        System.out.println("The First Number is " + firstNumber);
        System.out.println("The Second Number is " + secondNumber);
    }
}
