package com.test;

import org.testng.annotations.Test;

public class DataProviderTest5 {

	@Test(dataProvider = "dp", dataProviderClass = DataSupplier.class)
	public void test(String str) {
		System.out.println(str);
	}

}
