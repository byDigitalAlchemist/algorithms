package com.dc.problems.lc;

public class OneEditDistance {

	public boolean isOneEditDistance(String leftString, String rightString) {

		System.out.println("Left :: " + leftString + " :: Right :: " + rightString);
		
		int small = leftString.length();
		int big = rightString.length();

		if (small > big)
			isOneEditDistance(rightString, leftString);

		if (big - small > 1)
			return false;

		int start = 0, shift = big - small;

		while (start < small && leftString.charAt(start) == rightString.charAt(start))
			start++;

		if (start == small)
			return shift > 0;

		if(shift == 0)
			start++;
			
		while (start < small && leftString.charAt(start) == rightString.charAt(start+shift))
			start++;

		return start == small;
	}
}
