package com.practice.code.java.basic;

public class Fibonacci {
	public static void main(String[] args) {
		int num = 10;
		int first = 0, second = 1, next;
		System.out.print("Fibonacci Series - ");
		for(int i=0;i<num;i++) {
			System.out.print(first+ " ");
			next = first + second;
			first = second;
			second = next;
		}
	}
}
