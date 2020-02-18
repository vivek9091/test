package com.vivek.practise;

import static org.junit.Assert.*;

import org.junit.Test;

public class CheckPermutationTest {

	@Test
	public void testCheckPermutation() {
		CheckPermutation cp =new CheckPermutation();
		//boolean result = cp.checkPermutation("God", "dog");
		//assertEquals (true,result);
		assertTrue(cp.checkPermutation("go124d  ", "  21dog4"));
		assertFalse(cp.checkPermutation("God ", "dog  "));
		assertFalse(cp.checkPermutation("God123", "d12o3g"));
	}

}
