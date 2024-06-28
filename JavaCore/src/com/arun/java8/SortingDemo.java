package com.arun.java8;

import java.util.Arrays;
import java.util.List;

public class SortingDemo {

	public static void main(String[] args) {

		
		List<Integer> numList = Arrays.asList(23,3,1,5,7,23,24);
		
		numList.stream()
		.filter(num->num>5 && num%2==0)
		.sorted()
		.distinct()
		.forEach(System.out::println);
	}

}
