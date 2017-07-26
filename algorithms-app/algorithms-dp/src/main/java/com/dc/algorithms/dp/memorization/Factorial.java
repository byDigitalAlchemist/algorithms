package com.dc.algorithms.dp.memorization;

public class Factorial {

	public static long getFactorialUsingMemorization(long userInput){
		
		if(userInput < 0)
			throw new IllegalArgumentException();
		
		long[] memory = new long[(int) userInput+1];
		
		long factorial = 1;
		
		if(userInput == 0 || userInput == 1){
			memory[0] = 1;
			return factorial;
		}
		
		for (int i = 2; i <= userInput; i++) {
			memory[i-1] = factorial = factorial * i;
		}
		
		return memory[(int) userInput-1];
	}
}
