package com.busyqa.course;

public class SumAndAverage {

	public static void main(String[] args) {
		
		double sum = 0;
		double average;
		
		for(int i = 0; i<101; i++) {
			sum = sum + i;
			
		}
		
		average = sum / 100;
		
		System.out.println("The sum is " + sum);
		System.out.println("The average is " + average);

	}

}