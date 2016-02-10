package com.training.tests;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.training.domain.FindPerfectNumber;

@RunWith(Parameterized.class)

public class TestPerfectNumbersByParam {

	private int number;
	public TestPerfectNumbersByParam(int number) {
		// TODO Auto-generated constructor stub
		this.number = number;
	}
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPerfectNumber() {
	//	fail("Not yet implemented");
	
		FindPerfectNumber findNumber = new FindPerfectNumber(number);
		assertTrue(number + " number is not perfect", findNumber.isPerfect());
	}

	@Parameters
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][] {{6} ,{28},{33}};
		return Arrays.asList(data);
	}
}
