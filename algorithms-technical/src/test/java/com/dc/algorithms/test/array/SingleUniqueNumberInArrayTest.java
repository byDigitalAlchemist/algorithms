package com.dc.algorithms.test.array;

import org.junit.Assert;
import org.junit.Test;

import com.dc.algorithms.technical.bit.BitUtility;

public class SingleUniqueNumberInArrayTest {

	@Test
	public void getUniqueNumberTest1(){
		int[] inputArray= {9,2,3,5,8,9,99,8,5,2,3};
		Assert.assertEquals(99, BitUtility.getSingleUniqueNumberInArray(inputArray));
	}
	
	@Test
	public void getUniqueNumberTest2(){
		int[] inputArray= {9};
		Assert.assertEquals(9, BitUtility.getSingleUniqueNumberInArray(inputArray));
	}
	
	@Test
	public void getUniqueNumberTest3(){
		int[] inputArray= {};
		Assert.assertEquals(0, BitUtility.getSingleUniqueNumberInArray(inputArray));
	}
	
	@Test
	public void getUniqueNumberTest4(){
		int[] inputArray= {1,2,3,4,0,0,3,4,2,1,0};
		Assert.assertEquals(0, BitUtility.getSingleUniqueNumberInArray(inputArray));
	}
	
	@Test
	public void getUniqueNumberTest5(){
		int[] inputArray= {1,2,3,4,5,5,3,4,2,1,5};
		Assert.assertEquals(5, BitUtility.getSingleUniqueNumberInArray(inputArray));
	}
}
