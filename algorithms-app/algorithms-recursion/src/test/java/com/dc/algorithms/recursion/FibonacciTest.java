package com.dc.algorithms.recursion;

import org.junit.Assert;
import org.junit.Test;

public class FibonacciTest {

	@Test
	public void recusiveTest1(){
		Assert.assertEquals(120L,FibonacciUtility.calculateRecursive(5L));
	}
	@Test
	public void iterativeTest1(){
		Assert.assertEquals(120L,FibonacciUtility.calculateIterative(5L));
	}
	@Test
	public void recusiveTest2(){
		Assert.assertEquals(355687428096000L,FibonacciUtility.calculateRecursive(17L));
	}
	@Test
	public void iterativeTest2(){
		Assert.assertEquals(355687428096000L,FibonacciUtility.calculateIterative(17L));
	}
	@Test
	public void recusiveTest3(){
		Assert.assertEquals(1L,FibonacciUtility.calculateRecursive(1L));
	}
	@Test
	public void iterativeTest3(){
		Assert.assertEquals(1L,FibonacciUtility.calculateIterative(1L));
	}
	@Test
	public void recusiveTest4(){
		Assert.assertEquals(1L,FibonacciUtility.calculateRecursive(0L));
	}
	@Test
	public void iterativeTest4(){
		Assert.assertEquals(1L,FibonacciUtility.calculateIterative(0L));
	}
}
