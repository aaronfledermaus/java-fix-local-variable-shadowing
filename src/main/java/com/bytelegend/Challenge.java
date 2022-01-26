package com.bytelegend;

public class Challenge {
    public static int sum = 0;

    public static void main(String[] args) {
          System.out.println("addAverageOf(1,3): " + addAverageOf(1,3));
		sum=addAverageOf(1,3);
        System.out.println("addAverageOf(2,6): " + addAverageOf(2,6));
				sum=addAverageOf(2,6);
        System.out.println("addAverageOf(3,5): " + addAverageOf(3,5));
    }

    public static int addAverageOf(int a, int b) {
        int average = (a+b) / 2;
        //int sum =0;
		//sum =+ average;
		return sum + average;
    }
}
