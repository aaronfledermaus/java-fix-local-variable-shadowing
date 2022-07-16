package com.bytelegend;

public class Challenge {
    public static int sum = 0;
    private static int average = 0;

    public static void main(String[] args) {
        addAverageOf(1, 3);
        System.out.println("addAverageOf(1,3): " + average);
        addAverageOf(2, 6);
        System.out.println("addAverageOf(2,6): " + average);
        addAverageOf(3, 5);
        System.out.println("addAverageOf(3,5): " + average);
    }

    public static void addAverageOf(int a, int b) {
        int tempSum = a + b;
        average = tempSum / 2;
        sum = sum + average;
    }
}
