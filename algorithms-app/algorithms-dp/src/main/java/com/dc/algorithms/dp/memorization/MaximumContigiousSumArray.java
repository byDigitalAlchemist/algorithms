package com.dc.algorithms.dp.memorization;

import java.util.Arrays;

public class MaximumContigiousSumArray {
	
	public static void main(String[] args) {
        //Integer [] data = {-2, -3, 4, -1, -2, 1, 5, -3};
        //Integer [] data = {-2, -3, -3};
		//Integer [] data = {-2, -3, -3, 0};
		Integer [] data = {3,4,0,1,2};
        
        
        printArray(data);
        getMaximumSubSum(data);
	}
	public static void getMaximumSubSum(Integer[] data){
		int arrayLength = data.length;
		int maxSum = 0;
		int continuousSum = 0;
		int previousStart = 0;
		int start = 0;
		int end = 0;
		for (int i = 0; i < arrayLength; i++) {
			
			if(start == -1){
				start = i;
				end = i;	
			}
			
			continuousSum = continuousSum + data[i];
			
			
			if(maxSum < continuousSum){
				maxSum = continuousSum;
				previousStart = start;
				end = i;
			}
			
			if(continuousSum < 0){
				continuousSum = 0;
				start = -1;
				end = -1;
			}
			else if (data[i] == 0){
				continuousSum = 0;
				start = -1;
				end = -1;
			}
			
		}
		
		if(previousStart == -1)
			System.out.println("N/A");
		else
			System.out.println(" Big Sum :: " + Math.max(maxSum, continuousSum) + " Start :: " + previousStart + " End :: " + end);
	}
	public static void printArray(Integer[] userArray){
		
		System.out.println(Arrays.deepToString(userArray));
	}

}
