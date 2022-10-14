package com.test;

import org.testng.annotations.Test;

public class FlightBookingTest {

	@Test(priority=1)
	public void signUp() {
		System.out.println("signUp method executed");
	}
	
	@Test(priority=2)
	public void login() {
		System.out.println("login method executed");
	}
	
	@Test(priority=3)
	public void searchForFlight() {
		System.out.println("searchForFlight method executed");
	}
	
	@Test(priority=4)
	public void bookTheFlight() {
		System.out.println("bookTheFlight method executed");
	}
	
	@Test(priority=5)
	public void saveTheTicket() {
		System.out.println("saveTheTicket method executed");
	}
	
	@Test(priority=6)
	public void logout() {
		System.out.println("logout method executed");
	}
}
