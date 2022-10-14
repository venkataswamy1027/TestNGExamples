package com.test;

import org.testng.annotations.Test;

public class PriorityTest {
	@Test
	public void mango() {
		System.out.println("mango");
	}

	@Test(priority = 2)
	public void apple() {
		System.out.println("apple");
	}

	@Test(priority = 1)
	public void watermelon() {
		System.out.println("watermelon");
	}
}
