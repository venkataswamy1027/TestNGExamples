package com.test;

import org.testng.annotations.Test;

public class DescriptionTest {
	@Test(description = "This is testcase1")
	public void testcase1() {
		System.out.println("testcase1");
	}

	@Test(description = "This is testcase2")
	public void testcase2() {
		System.out.println("testcase2");
	}

	@Test(description = "This is testcase3")
	public void testcase3() {
		System.out.println("testcase3");
	}
}
