package com.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest1 {

	@Test(dataProvider = "dp")
	public void test(String str) {
		System.out.println(str);
	}

	@DataProvider
	public String[] dp() {
		return new String[] { "abc", "xyz", "pqr" };
	}
}
