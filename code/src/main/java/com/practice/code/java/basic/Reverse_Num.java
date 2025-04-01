package com.practice.code.java.basic;

public class Reverse_Num {
	public static void main(String[] args) {
		int num = 1984567;
		int temp = num;
		int rev = 0;
		while(temp>0) {
			num = temp % 10;
			rev = rev * 10 + num;
			temp = temp/10;
		}
		System.out.println("Reverse Number -> " +rev);
	}

}
