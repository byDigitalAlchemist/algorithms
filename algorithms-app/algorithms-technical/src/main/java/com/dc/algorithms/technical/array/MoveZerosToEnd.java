package com.dc.algorithms.technical.array;


/**
 * Task : Move Zeros to end with order intact
 * move takes user input array and the value to move
 *  
 *  Swap is executed only iff current value == valueToMove 
 *  	We get two conditions, 
 *  		if next value is a normal value
 *  			we execute swap 
 *  		if next value is also a valueToMove
 *  			we identify next normal value
 *  				if next normal value is found we swap 
 *  			else 
 *  				terminate the algorithm
 * @author Digital Alchemist
 */
public class MoveZerosToEnd {

	public static <T> void move(T[] userArray, T valueToMove) {
		for (int j = 0; j < userArray.length; j++) {
			
			if (userArray[j] == valueToMove && j+1 <= userArray.length-1) {
			
				if (userArray[j + 1] == valueToMove) {
					int init = j;
					while (userArray[init + 1] == valueToMove) {
						init++;
						if(init + 1 > userArray.length-1)
							break;
					}
					if(init + 1 > userArray.length-1)
						break;
					
					swap(userArray, j, init + 1);
				} else {
					swap(userArray, j, j + 1);
				}
			}

			print(userArray);

		}
	}

	private static <T> void swap(T[] userArray, int swapStartIndex, int swapEndIndex) {
		T temp;
		temp = userArray[swapStartIndex];
		userArray[swapStartIndex] = userArray[swapEndIndex];
		userArray[swapEndIndex] = temp;
	}

	public static <T> void print(T[] userArray) {
		for (T integer : userArray) {
			System.out.print(integer);
		}
		System.out.println();
	}
}
