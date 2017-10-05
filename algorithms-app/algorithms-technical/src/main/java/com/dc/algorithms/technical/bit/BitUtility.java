package com.dc.algorithms.technical.bit;

public class BitUtility {

	public int[] getUniqueNumbersInArray() {
		int[] uniqueNumbers = new int[5];

		return uniqueNumbers;
	}

	/**
	 * This function returns Single Unique Number in the Array, it also assumes
	 * the numbers in array can not appear more than twice and max one unique
	 * number
	 * 
	 * @param inputArray
	 * @return int
	 */
	public static int getSingleUniqueNumberInArray(int[] inputArray) {
		int num = 0;
		for (int item : inputArray) {
			num ^= item;
		}
		return num;
	}

	public static int getSingleUniqueNumberInThreeValueArray(int[] inputArray) {
		int ones = 0, twos = 0, threes = 0;

		for (int x : inputArray) {
			twos |= ones & x;
			ones ^= x;
			threes = ~(ones & twos);
			ones &= threes;
			twos &= threes;
		}
		return ones;
	}
}
