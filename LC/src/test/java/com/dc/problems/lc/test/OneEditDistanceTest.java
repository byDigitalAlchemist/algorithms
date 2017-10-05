package com.dc.problems.lc.test;

import org.junit.Assert;
import org.junit.Test;

import com.dc.problems.lc.OneEditDistance;

public class OneEditDistanceTest {

	@Test
	public void testModifyOperations() {
		OneEditDistance instance = new OneEditDistance();
		Assert.assertTrue(instance.isOneEditDistance("abcde","abXde"));
	}
	
	@Test
	public void testInsertOperations() {
		OneEditDistance instance = new OneEditDistance();
		Assert.assertTrue(instance.isOneEditDistance("abcde","abcXde"));
	}
	
	@Test
	public void testAppendOperations() {
		OneEditDistance instance = new OneEditDistance();
		Assert.assertTrue(instance.isOneEditDistance("abcde","abcdeX"));
	}
	
	
	@Test
	public void testFailOperations() {
		OneEditDistance instance = new OneEditDistance();
		Assert.assertFalse(instance.isOneEditDistance("abcde","abcdeX"));
	}
}
