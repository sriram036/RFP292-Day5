package com.bridgelabz.basic;

import java.util.Scanner;

public class ArithmeticDivision {
    public static void main(String[] args) {
        int quotient = 0;
        int remainder = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Dividend :");
        int dividend = scanner.nextInt();
        System.out.println("Enter the Divisor :");
        int divisor = scanner.nextInt();
        quotient = dividend / divisor;
        remainder = dividend % divisor;
        System.out.println("The Quotient is " + quotient);
        System.out.println("The Remainder is " + remainder);
    }
}
