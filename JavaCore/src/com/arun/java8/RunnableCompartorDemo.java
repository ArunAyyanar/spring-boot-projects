package com.arun.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class RunnableCompartorDemo {

	public static void main(String[] args) {

		
		Runnable r1 = new Runnable() {
		@Override
		public void run() {
			System.out.println("Thread 1 running");
		}			
		};
		
		Thread t1 = new Thread(r1);
		
		t1.start();	
		
		// After java8		
		
		new Thread(()->{System.out.println("Thread2 running");}).start();
		
		
		List<Integer> numList = Arrays.asList(23,4,5,2,13,7,88,90,100,66);
		
		
		// before java8
		
		int temp;
		
		for(int i =0;i<numList.size();i++) {
			for(int j=i+1;j<numList.size();j++) {
				if(numList.get(i)<numList.get(j)) {
					temp=numList.get(i);
					numList.set(i, numList.get(j));
					numList.set(j, temp);
				}
			}
		}
		
		numList.forEach(System.out::println);
		
		
		numList.stream()
		//.sorted()
		.sorted(Comparator.reverseOrder())
		.forEach(System.out::println);
		
	
		
	}

}
