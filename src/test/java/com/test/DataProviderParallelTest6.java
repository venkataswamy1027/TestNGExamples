package com.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderParallelTest6 {

	@Test(dataProvider = "dp")
	public void test(String str[]) {
		System.out.println(str[0] + " " + str[1]);
	}

	@DataProvider(parallel = true)
	public String[][] dp() {
		return new String[][] { { "ts", "hyd" }, { "ap", "amaravati" }, { "tl", "chennai" }, { "mh", "mumbai" },
				{ "mh", "pune" }, { "ka", "blr" }

		};
	}
}
