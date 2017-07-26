package com.dc.algorithms.sort.strategy;

import java.util.Arrays;
import java.util.List;

public class BubbleSort implements ISortStrategy{

	public void sort(int[] data) {
		boolean swapFound = true;
		
		while(swapFound){
			swapFound = false;
			for (int i = 0; i < data.length; i++) {
				if( i+1 < data.length && data[i] > data[i+1]){
					swap(data,i);
					swapFound = true;
				}
			}
			
		}
		
		display(data);
	}

	private void display(int[] data) {
		System.out.println(Arrays.toString(data));
	}

	private void swap(int[] data, int index) {
		Integer temp = data[index];
		data[index] = data[index+1];
		data[index+1] = temp;
		
	}


	@Override
	public void sort(Integer[] data) {
		// TODO Auto-generated method stub
		
	}


}
