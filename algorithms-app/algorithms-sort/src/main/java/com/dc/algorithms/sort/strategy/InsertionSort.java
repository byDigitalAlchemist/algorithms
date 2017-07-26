package com.dc.algorithms.sort.strategy;

public class InsertionSort implements ISortStrategy {
	@Override
	public void sort(Integer[] data) {

		for (int currentIndex = 1; currentIndex < data.length; currentIndex++) {
			
			int currentValue = data[currentIndex];
			int previousIndex  = currentIndex-1;
			
			while(previousIndex >= 0 &&  currentValue < data[previousIndex]){
				data[previousIndex+1] = data[previousIndex];
				previousIndex--;
			}
			
			data[previousIndex+1] = currentValue;
			
		}
	}

	// Driver method
	public static void main(String args[]) {
		Integer arr[] = { 12, 11, 13, 5, 6 };

		InsertionSort ob = new InsertionSort();
		ob.sort(arr);

		printArray(arr);
	}

	static void printArray(Integer[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");

		System.out.println();
	}
}
