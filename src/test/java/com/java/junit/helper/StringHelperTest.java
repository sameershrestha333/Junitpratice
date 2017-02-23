package com.java.junit.helper;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class StringHelperTest {
	private StringHelper helper;
	
	

	@Before
	public void setUp() throws Exception {
		helper = new StringHelper();
	}

	@Test
	public void testTruncateAInFirst2Positions1() {
		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
	}

	@Test
	public void testTruncateAInFirst2Positions2() {
		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
	}

	@Test
	public void testareFirstAndLastTwoCharactersTheSame_BasicNagativeSenario() {
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
		// assertFalse("Test didn't pass :",true);
		// assertFalse(true);

	}

	@Test
	public void testareFirstAndLastTwoCharactersTheSame_BasicPositiveSenario() {
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
		// assertTrue("Test didn't pass :",false);
		// assertTrue(false);

	}
	
	
}
