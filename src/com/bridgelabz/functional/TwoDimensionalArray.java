package com.bridgelabz.functional;

import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows :");
        int M = scanner.nextInt();
        System.out.println("Enter the number of columns :");
        int N = scanner.nextInt();
        int[][] twoDimensionalArray = new int[M][N];
        System.out.println("Enter the values of an array...");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.println("Enter [" + i +"][" + j + "] index data :");
                twoDimensionalArray[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(twoDimensionalArray[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
