package com.test;

import org.testng.annotations.Test;

public class Module3 {
	@Test(enabled = false)
	public void test1() {
		System.out.println("test1 in Module3");
	}

	@Test
	public void test2() {
		System.out.println("test2 in Module3");
	}

	@Test
	public void test3() {
		System.out.println("test3 in Module3");
	}
}
