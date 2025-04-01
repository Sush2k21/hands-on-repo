package com.practice.code.java.basic;

public class Palindrome {
	public static void main(String[] args) {
		int num = 4554;
		int org = num;
		int temp = num;
		int rev = 0;
		while(temp>0) {
			num = temp%10;
			rev = rev*10 + num;
			temp = temp/10;
		}
		if(org == rev) {
			System.out.println("Given number is Palindrome");
		} else {
			System.out.println("Given number is not Palindrome");
		}
	}

}
