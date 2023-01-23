package com.bytelegend;

public class Challenge {
    public static int sum = 0;

    public static void main(String[] args) {
        sum = addAverageOf(1, 3);
        System.out.println("addAverageOf(1,3): " + sum);
        sum = addAverageOf(2, 6) + sum;
        System.out.println("addAverageOf(2,6): " + sum);
        sum = addAverageOf(3, 5) + sum;
        System.out.println("addAverageOf(3,5): " + sum);
    }

    public static int addAverageOf(int a, int b) {
        int sum = a + b;
        int average = sum / 2;
        return average;
    }
}
