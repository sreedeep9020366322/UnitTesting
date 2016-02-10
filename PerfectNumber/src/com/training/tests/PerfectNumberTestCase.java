package com.training.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.training.domain.FindPerfectNumber;

public class PerfectNumberTestCase {

	FindPerfectNumber findnum = new FindPerfectNumber(6);
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	
	@Test
	public void testPositiveNumber() {
		//fail("Not yet implemented");
				
		assertTrue(findnum.getNumber() > 0);
	}

	@Test
	public void testReturnType() {
		//fail("Not yet implemented");
				
		Boolean b = findnum.isPerfect();
		assertEquals(Boolean.class, b.getClass());
		
		//assertTrue(b.getClass() == Boolean.class);
		//assertTrue(b);	
	}
	
	@Test
	public void testPerfect() {
		
		assertTrue(findnum.isPerfect() == true);
		
	}
	
	@Test
	public void testImPerfect() {
		
		assertTrue(findnum.isPerfect() == false);
		
	}

}
