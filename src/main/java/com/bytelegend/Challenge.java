package com.bytelegend;

public class Challenge {
    public static int sum = 0;

    public static void main(String[] args) {
        sum = addAverageOf(1, 3);
        System.out.println("addAverageOf(1,3): " + sum);
        sum = addAverageOf(2, 6);
        System.out.println("addAverageOf(2,6): " + sum);
        sum = addAverageOf(3, 5);
        System.out.println("addAverageOf(3,5): " + sum);
    }

    public static int addAverageOf(int a, int b) {
//        sum = a + b;
        int average = (a + b) / 2;
        average = average + sum;
//        System.out.println(average);
        return average;
    }
}
