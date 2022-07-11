package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        int sum;
        sum = addAverageOf(1, 3);
        System.out.println("addAverageOf(1,3): " + sum);
        sum = addAverageOf(2, 6);
        System.out.println("addAverageOf(2,6): " + sum);
        sum = addAverageOf(3, 5);
        System.out.println("addAverageOf(3,5): " + sum);
    }

    public static void addAverageOf(int a, int b) {
        int sum = a + b;
        int average = sum / 2;
        sum = sum + average;
        
        return sum;
    }
}
