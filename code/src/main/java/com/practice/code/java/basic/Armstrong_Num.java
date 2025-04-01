package com.practice.code.java.basic;

public class Armstrong_Num {
	public static void main(String[] args) {
		int num = 371;
		int org = num;
		int temp = num;
		int armstrong = 0;
		while(temp>0) {
			num = temp%10;
			armstrong = armstrong + num*num*num;
			temp = temp/10;
		}
		if(org == armstrong) {
			System.out.println("Given number is an Armstrong number");
		} else {
			System.out.println("Given number is not an Armstrong number");
		}
	}		
}
