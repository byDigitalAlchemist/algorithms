package com.dc.algorithms.recursion;

import java.util.Arrays;

import org.junit.Test;

public class CombinationTest {

	@Test
	public void selectionTest1(){
		System.out.println(Arrays.toString(CombinationUtility.makeSelection(0	, 2L, new long[]{1,2,3,4,5,6,7})));
	}
}
