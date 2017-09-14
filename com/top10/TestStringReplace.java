package com.top10;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestStringReplace {

	@Test
	public void testStringReplace(){
		
		String result = StringReplace.replace("Apple", 'p');
		assertEquals("Ale", result);
		
	}
	
}
