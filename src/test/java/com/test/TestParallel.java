package com.test;

import org.testng.annotations.Test;

public class TestParallel {

	@Test
	public void method1() {
		System.out.println("Inside method1()");
	}

	@Test
	public void method2() {
		System.out.println("Inside method2()");
	}
}
