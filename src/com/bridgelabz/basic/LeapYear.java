package com.bridgelabz.basic;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        boolean isLeapYear = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Year :");
        int year = scanner.nextInt();
        if (year >= 1582) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 ==0) {
                        isLeapYear = true;
                    }
                    else {
                        isLeapYear = false;
                    }
                }
                else {
                    isLeapYear = true;
                }
            }
            else {
                isLeapYear = false;
            }
        }
        else {
            System.out.println("The Year should be more than 1582.");
        }
        if (isLeapYear) {
            System.out.println("The year " + year + " is a Leap Year.");
        }
        else {
            System.out.println("The year " + year + " is not a Leap Year.");
        }
    }
}
