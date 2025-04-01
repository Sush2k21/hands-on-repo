package com.practice.code.java.string;

public class RevEachWordOfString {
	
	// One way
	/*public static void main(String[] args) {
		String val = "Reverse Each Word Of The String";
		String temp = "";
		String res = "";
		for(int i=0;i<val.length();i++) {
			if(val.charAt(i)!=' ') {
				temp = temp + val.charAt(i);
			} else {
				if(val.charAt(i)==' ' ) {
					res = res + rev(temp)+val.charAt(i);
					temp = "";
				}
			}
		}
		res = res + rev(temp);
		System.out.println(res);
	}
	
	public static String rev(String value) {
		String rev = "";
		for(int j=value.length()-1;j>=0;j--) {
			rev = rev + value.charAt(j);
		}
		return rev;
	}*/
	
	//Second way using split
	public static void main(String[] args) {
		String val = "Reverse Each Word Of The String";
		String[] words = val.split(" ");
		String rev = "";
		String res = "";
		for(int i=0;i<words.length;i++) {
			String word = words[i];
			for(int j=0;j<word.length();j++) {
				rev = word.charAt(j) + rev;
			}
			res = res + rev + " ";
			rev = "";
		}
		System.out.println(res);
	}
}
