package com.mph.testcase;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestClass {
	
	@Test
	public void testAllAssertMethods()
	{
		String str1 = new String("Rahul");
		String str2 = new String("Rahul");
		String str3 =null;
		String str4="deeps";
		String str5="deeps";
		
		
		int val1=5;
		int val2=6;
		
		//assertEquals(str4, str5);
		//assertSame(str4, str5);
		assertNotSame(str1, str2);
		//assertTrue(val1<val2);
		//assertFalse(val1<val2);
		//assertNotNull(str3);
		
	}

}