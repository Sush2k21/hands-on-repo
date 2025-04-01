package com.practice.code.java.basic;

public class Prime_NonPrime {
	public static void main(String[] args) {
		int num = 37;
		System.out.print("Prime numbers till " +num +" -> ");
		for(int i=1;i<=num;i++) {
			if(isPrime(i)) {
				System.out.print(i +" ");
			}
		}
		System.out.println();
		if(isPrime(num)) {
			System.out.println("Provided number is a Prime number");
		} else {
			System.out.println("Provided number is a Non-Prime number");
		}
	}
	public static boolean isPrime(int num) {
		if(num == 0 || num == 1) {
			return false;
			
		} else {
			for(int i=2;i<=Math.sqrt(num);i++) {
				if(num%i==0) {
					return false;
				}
			}
		}
		return true;
	}
}
