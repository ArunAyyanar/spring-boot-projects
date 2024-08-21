package com.arun.java8;

import java.util.HashMap;
import java.util.Map;

public class CountNumberOfLetters {

	public static void main(String[] args) {

		String message = "welcome to java world";

		// traditional way

		Map<Character, Integer> countMap = new HashMap<>();
		for (char ch : message.toCharArray()) {
			if (countMap.containsKey(ch)) {
				countMap.put(ch, countMap.get(ch) + 1);
			} else {
				countMap.put(ch, 1);
			}
		}
		
		System.out.println(countMap);

	}

}
