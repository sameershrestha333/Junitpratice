package com.java.junit.helper;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringHelperParameterizedTest {
	private StringHelper helper = new StringHelper();

	private String input;
	private String expectedOutput;

	public StringHelperParameterizedTest(String input, String expectedOutput) {
		super();
		this.input = input;
		this.expectedOutput = expectedOutput;
	}

	@Parameters
	public static Collection<String[]> testCondition() {
		String expectedoutput[][] = { { "AACD", "CD" }, { "ACD", "CD" }};
		return Arrays.asList(expectedoutput);
	}

	@Test
	public void testTruncateAInFirst2Positions1() {
		assertEquals(expectedOutput, helper.truncateAInFirst2Positions(input));
	}

	@Test
	public void testTruncateAInFirst2Positions2() {
		assertEquals(expectedOutput, helper.truncateAInFirst2Positions(input));
	}

}
