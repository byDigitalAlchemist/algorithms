package com.dc.algorithms.technical.array;

public class ArrayShifter {

	public <T> void shift(T[] userArray){
		shift(userArray, 1);
	}
	
	public <T> void shift(T[] userArray, int shiftNumber){
		
	}
	
	public static void main(String[] args) {

        int[] elements = new int[] {1,2,3,4,0,0,0,5,6,0,7,8,9};

        int swapCount = 0;
        int lastIndex = elements.length-1;

        for(int i = lastIndex-1; i >=0; i--) {  // skip the very last element
            if(elements[i] == 0) {
                elements[i] = elements[lastIndex-swapCount];
                elements[lastIndex-swapCount] = 0;
                swapCount++;
            }
        }

        for(int i : elements) {
            System.out.print(i + ", ");
        }
    }
}
