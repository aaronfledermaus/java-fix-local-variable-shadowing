package com.bytelegend;

public class Challenge {
    public static int sum = 0;

    public static void main(String[] args) {
        System.out.println("addAverageOf(1,3): " + sum);
        System.out.println("addAverageOf(2,6): " + sum);
        System.out.println("addAverageOf(3,5): " + sum);
    }

    public static int addAverageOf(int a, int b) {
        int average = (a+b) / 2;
        //int sum =0;
		//sum =+ average;
		return sum + average;
    }
}
