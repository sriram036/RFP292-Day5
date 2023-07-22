package com.bridgelabz.basic;

public class PowerOfTwo {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        if (number < 31){
            for (int i = 0; i <= number; i++) {
                int answer = 1;
                int exponent = i;
                while (exponent != 0){
                    answer *= 2;
                    exponent--;
                }
                System.out.println("2 power of " + i + " is " + answer);
            }
        }
    }
}
