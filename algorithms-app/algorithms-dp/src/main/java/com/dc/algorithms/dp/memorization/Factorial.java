package com.dc.algorithms.dp.memorization;

import java.util.Arrays;

public class Factorial {

	public static long getFactorialUsingMemorization(long userInput){
		
		if(userInput < 0)
			throw new IllegalArgumentException();
		
		long[] memory = new long[(int) userInput];
		long factorial = 1;
		
		if(userInput == 0 || userInput == 1){
			return factorial;
		}
		
		memory[0] = 1;
		
		for (int i = 2; i <= userInput; i++) {
			memory[i-1] = factorial = factorial * i;
		}
		
		System.out.println(Arrays.toString(memory));
		return memory[(int) userInput-1];
	}
}
