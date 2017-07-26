package com.dc.algorithms.dp.memorization;

public class Factorial {

	public static long getFactorialUsingMemorization(long userInput){
		
		if(userInput < 0)
			throw new IllegalArgumentException();
		
		long[] memory = new long[(int) userInput];
		
		long factorial = 1;
		
		if(userInput == 0 || userInput == 1)
			return factorial;
		
		for (int i = 2; i < userInput; i++) {
			memory[i] = factorial * userInput;
		}
		
		return memory[(int) userInput-1];
	}
}
