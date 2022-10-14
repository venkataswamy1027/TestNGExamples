package com.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest3 {

	@Test(dataProvider = "dp")
	public void test(String str) {
		System.out.println(str);
	}

	@DataProvider
	public Iterator<String> dp() {
		List<String> list = new ArrayList<>();
		list.add("hi");
		list.add("welcome");
		return list.iterator();
	}
}
