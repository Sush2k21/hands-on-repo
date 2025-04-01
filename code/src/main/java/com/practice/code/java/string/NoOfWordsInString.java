package com.practice.code.java.string;

public class NoOfWordsInString {
	public static void main(String[] args) {
		String val = "Number of words in a string";
		String[] words = val.split(" ");
		int count = 0;
		for(String word: words) {
			count++;
		}
		System.out.println(count);
	}

}
