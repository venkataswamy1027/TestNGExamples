package com.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.DataProvider;

public class DataSupplier {
	@DataProvider()
	public Iterator<String> dp() {
		List<String> list = new ArrayList<>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		return list.iterator();
	}
}
