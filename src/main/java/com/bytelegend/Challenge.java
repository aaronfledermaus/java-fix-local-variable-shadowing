package com.bytelegend;

public class Challenge {
    
    public static void main(String[] args) {
        public static int sum = 0;

        addAverageOf(1, 3);
        System.out.println("addAverageOf(1,3): " + sum);
        addAverageOf(2, 6);
        System.out.println("addAverageOf(2,6): " + sum);
        addAverageOf(3, 5);
        System.out.println("addAverageOf(3,5): " + sum);
    }

    public static void addAverageOf(int a, int b) {
        int average = (a+b) / 2;
        sum = sum + average;
    }
}
