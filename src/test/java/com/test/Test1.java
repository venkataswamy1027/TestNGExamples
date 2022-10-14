package com.test;

import org.testng.annotations.Test;

public class Test1 {
	@Test
	public void test1() {
		System.out.println("Test1 class test1 method executed "+Thread.currentThread().getId());
	}

	@Test
	public void test2() {
		System.out.println("Test1 class test2 method executed "+Thread.currentThread().getId());
	}

	public void test3() {
		System.out.println("Test1 class test3 method executed "+Thread.currentThread().getId());
	}

	@Test
	public void test4() {
		System.out.println("Test1 class test4 method executed "+Thread.currentThread().getId());
	}
}
