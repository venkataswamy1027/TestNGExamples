package com.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest4 {

	@Test(dataProvider = "dp")
	public void test(String str) {
		System.out.println(str);
	}

	@DataProvider(indices = { 0, 2 })
	public Iterator<String> dp() {
		List<String> list = new ArrayList<>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		return list.iterator();
	}
}
