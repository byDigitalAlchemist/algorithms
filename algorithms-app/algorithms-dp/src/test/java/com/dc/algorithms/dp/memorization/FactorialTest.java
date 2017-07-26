package com.dc.algorithms.dp.memorization;

import org.junit.Test;

import junit.framework.Assert;

public class FactorialTest {

	
	@Test(expected=IllegalArgumentException.class)
	public void negativeFactorialIsInvalid(){
		Assert.assertEquals(Factorial.getFactorialUsingMemorization(-4), 1L);
	}
	@Test
	public void zeroFactorialIsOne(){
		Assert.assertEquals(Factorial.getFactorialUsingMemorization(0), 1L);
	}
	@Test
	public void oneFactorialIsOne(){
		Assert.assertEquals(Factorial.getFactorialUsingMemorization(1), 1L);
	}
	@Test
	public void fiveFactorialIs120(){
		Assert.assertEquals(Factorial.getFactorialUsingMemorization(5), 120L);
	}
	@Test
	public void tenFactorialIs3628800(){
		Assert.assertEquals(Factorial.getFactorialUsingMemorization(10), 3628800L);
	}

	
	
	@Test
	public void threeFactorialIsSix(){
		Assert.assertEquals(Factorial.getFactorialUsingMemorization(1), 1L);
	}
	
	
	
}
