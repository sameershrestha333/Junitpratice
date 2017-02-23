package com.java.junit.helper;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class ArraysCompareTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		int[] numbers = { 12, 2, 4, 1 };
		int[] expected = { 1, 2, 4, 12 };
		Arrays.sort(numbers);
		// assertEquals(expected, numbers);
		assertArrayEquals(expected, numbers);
	}

	@Test(expected = NullPointerException.class)
	public void testArraySort_NullArray() {
		int[] numbers = null;
		Arrays.sort(numbers);
	}

	@Test(timeout=10)
	public void testSort_Performance() {
		int array[] = { 12, 23, 4 };
		for (int i = 1; i <= 1000000; i++) {
			array[0] = i;
			Arrays.sort(array);
		}
	}

}
