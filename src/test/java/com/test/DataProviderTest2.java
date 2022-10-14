package com.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest2 {

	@Test(dataProvider = "dp")
	public void test(String str[]) {
		System.out.println(str[0] + " " + str[1]);
	}

	@DataProvider
	public String[][] dp() {
		return new String[][] { { "ts", "hyd" }, { "ka", "blr" } };
	}
}
