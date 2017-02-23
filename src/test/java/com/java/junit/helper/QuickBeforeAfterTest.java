package com.java.junit.helper;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class QuickBeforeAfterTest {

	@BeforeClass
	public static void BeforeClass() {
		System.out.println("Before Class");
	}

	@Before
	public void setUp() {
		System.out.println("Before Test");
	}

	@Test
	public void test1() {
		System.out.println("Test 1 executed.");
	}

	@Test
	public void test2() {
		System.out.println("Test 2 executed.");
	}

	@After
	public void tearDown() {
		System.out.println("Connection close");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
	}
}
