package com.bridgelabz.functional;

public class Distance {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        System.out.println("The X point value is " + x);
        int y = Integer.parseInt(args[1]);
        System.out.println("The Y point value is " + y);
        int powerOfX = (int) Math.pow(x, x);
        int powerOfY = (int) Math.pow(y, y);
        float distance = (float) Math.sqrt(powerOfX + powerOfY);
        System.out.println("The distance from the given point "+ x +" and "+ y + " is " + distance);
    }
}
