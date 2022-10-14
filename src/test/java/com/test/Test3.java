package com.test;

import org.testng.annotations.Test;

public class Test3 {
	@Test
	public void test1() {
		System.out.println("Test3 class test1 method executed "+Thread.currentThread().getId());
	}

	@Test
	public void test2() {
		System.out.println("Test3 class test2 method executed "+Thread.currentThread().getId());
	}
	
	@Test
	public void test3() {
		System.out.println("Test3 class test3 method executed "+Thread.currentThread().getId());
	}
}
