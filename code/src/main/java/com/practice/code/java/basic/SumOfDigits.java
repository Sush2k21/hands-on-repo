package com.practice.code.java.basic;

public class SumOfDigits {
	public static void main(String[] args) {
		int num = 99991;
		int temp = num;
		int sum = 0;
		while(temp>0) {
			num = temp%10;
			sum = sum + num;
			temp = temp/10;
		}
		System.out.println("Total Sum of digits ->" +sum);
	}

}
