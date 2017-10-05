package com.dc.algorithms.strings.dp;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


public class LongestSubstringWithUniqueCharacterTest {
	@Rule
    public ExpectedException thrown = ExpectedException.none();
	
	
	@Test
	public void invalidString(){
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("Invalid input");

		Assert.assertEquals(null,LongestSubstringWithUniqueCharacters.getSubstringWithUniqueCharacters(null));
	}
	
	@Test
	public void uniqueCharactersAre6(){
		Assert.assertEquals(6,LongestSubstringWithUniqueCharacters.getSubstringWithUniqueCharacters("ABDEFGABEF"));
	}
	
	@Test
	public void uniqueCharactersAre5(){
		Assert.assertEquals(5,LongestSubstringWithUniqueCharacters.getSubstringWithUniqueCharacters("ABCDE"));
	}
	
	@Test
	public void uniqueCharactersAre1(){
		Assert.assertEquals(1,LongestSubstringWithUniqueCharacters.getSubstringWithUniqueCharacters("AAAA"));
	}
	
	@Test
	public void uniqueCharactersAre0(){
		Assert.assertEquals(0,LongestSubstringWithUniqueCharacters.getSubstringWithUniqueCharacters(""));
	}
	
	
}
