package com.dc.algorithms.dp.memorization;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.junit.Assert;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FactorialTest {

	@Test(expected=IllegalArgumentException.class)
	public void negativeFactorialIsException(){
		Assert.assertEquals(Factorial.getFactorialUsingMemorization(-4), 1L);
	}
	@Test
	public void zeroFactorialIs1(){
		Assert.assertEquals(Factorial.getFactorialUsingMemorization(0), 1L);
	}
	@Test
	public void oneFactorialIs1(){
		Assert.assertEquals(Factorial.getFactorialUsingMemorization(1), 1L);
	}
	@Test
	public void threeFactorialIs6(){
		Assert.assertEquals(Factorial.getFactorialUsingMemorization(3), 6L);
	}
	@Test
	public void fiveFactorialIs120(){
		Assert.assertEquals(Factorial.getFactorialUsingMemorization(5), 120L);
	}
	@Test
	public void tenFactorialIs3628800(){
		Assert.assertEquals(Factorial.getFactorialUsingMemorization(10), 3628800L);
	}
	
	
	
}
