package com.practice.code.java.string;

public class StringReverse {
	public static void main(String[] args) {
		String val = "Sushmita";
		String rev = "";
		for(int i=val.length()-1; i>=0;i--) {
			rev = rev + val.charAt(i);
		}
		System.out.println("Reverse of string ->" + rev);
	}
}
