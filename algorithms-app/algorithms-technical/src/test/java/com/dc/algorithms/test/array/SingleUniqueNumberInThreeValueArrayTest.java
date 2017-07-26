package com.dc.algorithms.test.array;

import org.junit.Assert;
import org.junit.Test;

import com.dc.algorithms.technical.bit.BitUtility;

public class SingleUniqueNumberInThreeValueArrayTest {

	@Test
	public void getUniqueNumberTest1(){
		int[] inputArray= {1,1,1,3,3,3,20,4,4,4};
		Assert.assertEquals(20, BitUtility.getSingleUniqueNumberInThreeValueArray(inputArray));
	}
	
}
