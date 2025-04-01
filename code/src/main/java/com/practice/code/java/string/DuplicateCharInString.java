package com.practice.code.java.string;

import java.util.HashMap;
import java.util.Map.Entry;

public class DuplicateCharInString {
	public static void main(String[] args) {
		String str = "Hello Java Knock Knock";
		String val= str.toLowerCase();
		HashMap<Character,Integer> map = new HashMap<>();
		for(int i=0;i<val.length();i++) {
			char res = val.charAt(i);
			if(res==' ') {
				continue;
			}
			if(map.containsKey(res)) {
				map.put(res, map.get(res)+1);
			} else {
				map.put(res, 1);
			}
		}
		System.out.println(map);
		System.out.print("Duplicate characters -> ");
		for(Entry<Character, Integer> hashMap:map.entrySet()) {
			if(hashMap.getValue()>1) {
				System.out.print(hashMap.getKey());
				System.out.print(" ");
			}
		}
	}
}
