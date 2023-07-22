package com.bridgelabz.basic;

import java.util.Scanner;

public class FindVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Alphabet :");
        char character = scanner.next().charAt(0);
        switch (character) {
            case 'a','e','i','o','u','A','E','I','O','U': {
                System.out.println("The given letter \'" + character + "\' is a Vowel.");
            }break;
            default:{
                System.out.println("The given letter \'" + character + "\' is a Consonant.");
            }
        }
    }
}
