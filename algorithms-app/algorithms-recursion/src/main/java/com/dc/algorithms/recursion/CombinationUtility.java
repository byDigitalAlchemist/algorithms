package com.dc.algorithms.recursion;

import java.util.Arrays;

public class CombinationUtility {

	public static long[] makeSelection(int index, long choices, long[] selections){

		if(index == selections.length){
			System.out.println(Arrays.toString(selections));
			return selections;
		}
		else{
			long start = 1;
			if(index > 0)
				start = selections[index-1] + 1;
		
			for (long i = start ; i < choices; i++) {
				selections[index] = i;
				makeSelection(index+1, choices, selections);
			}
		
		
		}
		
		return selections;
	}
}
