package com.test;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({ ITestListinerClass.class })
public class ListinerTest {
	@Test
	public void test1() {
		System.out.println("test1 method executed");
	}

	@Test
	public void test2() {
		System.out.println("test2 method executed");
		Assert.assertTrue(false);
	}

	@Test(timeOut = 200)
	public void test3() throws InterruptedException {
		System.out.println("test3 method executed");
		Thread.sleep(1000);
	}

	@Test(dependsOnMethods = "test3")
	public void test4() {
		System.out.println("test4 method executed");
	}
}
