package com.test;

import org.testng.annotations.Test;

public class ExcelSheetReadTest {
	@Test(dataProvider = "getData", dataProviderClass = ExcelSheetSupplier.class)
	public void test(String s1, String s2) {
		System.out.println(s1 + " " + s2);
	}
}
