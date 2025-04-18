package com.practice.code.java.basic;

public class NoOfDigits {
	public static void main(String[] args) {
		int num = 10;
		int temp = num;
		int count = 0;
		if(temp == 0) {
			count++;
		}
		while(temp!=0) {
			temp = temp/10;
			count++;
		}
		System.out.println("No. of digits - " +count);
	}

}
