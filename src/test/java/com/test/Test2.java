package com.test;

import org.testng.annotations.Test;

public class Test2 {
	@Test
	public void test1() {
		System.out.println("Test2 class test1 method executed "+Thread.currentThread().getId());
	}

	@Test
	public void test2() {
		System.out.println("Test2 class test2 method executed "+Thread.currentThread().getId());
	}
}
