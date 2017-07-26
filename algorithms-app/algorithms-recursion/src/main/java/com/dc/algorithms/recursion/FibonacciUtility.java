package com.dc.algorithms.recursion;

public class FibonacciUtility {

	public static long calculateIterative(long number){
		long answer = 1L;
		for(long i=number; i>=1; i--){
			answer = answer * number;
			number--;
		}
		return answer;
	}

	public static long calculateRecursive(long number){
		long answer = 1L;
		if(number == 0 || number == 1){
			System.out.println(" Answer :: " + answer + " Number :: " + number);
			return answer;
		}
		else 
			answer = number * calculateRecursive(number-1);
		
		System.out.println(" Answer :: " + answer + " Number :: " + number);
		return answer;
	}

}
