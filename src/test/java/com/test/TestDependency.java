package com.test;

import org.testng.annotations.Test;

public class TestDependency {

	private static String trackNumber = "";

	@Test
	public void createShipment() {
		System.out.println("createShipment method executed");
		trackNumber = "1Z999AA101";
	}

	@Test(dependsOnMethods = { "createShipment" })
	public void trackShipment() {
		if (trackNumber != null)
			System.out.println("trackShipment method executed");
	}

	@Test(dependsOnMethods = { "createShipment" })
	public void cancelShipment() {
		if (trackNumber != null)
			System.out.println("cancelShipment method executed");
	}
}
