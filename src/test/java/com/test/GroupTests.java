package com.test;

import org.testng.annotations.Test;

public class GroupTests {
	@Test(groups = { "smoke", "sanity" })
	public void test1() {
		System.out.println("test1 method executed");
	}

	@Test(groups = { "regression", "sanity" })
	public void test2() {
		System.out.println("test2 method executed");
	}

	@Test(groups = { "functional", "smoke" })
	public void test3() {
		System.out.println("test3 method executed");
	}

	@Test
	public void test4() {
		System.out.println("test4 method executed");
	}
}
