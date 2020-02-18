package com.vivek.practise;

import static org.junit.Assert.*;

import org.junit.Test;

public class URLifyTest {

	@Test
	public void test() {
		URLify url = new URLify();
		String result = url.replaceSpaces("   Mr John     Smith       ");
		assertEquals("Mr%20John%20Smith",result);
	}
	
	@Test
	public void test2() {
		URLify url = new URLify();
		String result = url.replaceUrlSpaces("Mr John Smith  	 ".toCharArray(),13);
		assertEquals("Mr%20John%20Smith",result);
	}

}
