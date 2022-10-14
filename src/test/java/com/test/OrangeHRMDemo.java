package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRMDemo {

	WebDriver driver;

	@Parameters("browserName")
	@BeforeTest
	public void initializeBroswer(String browser) {
		System.out.println("initializeBroswer method executed");
		switch (browser.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		case "firefox":
			WebDriverManager.edgedriver().setup();
			driver = new FirefoxDriver();
		default:
			System.out.println("browser does not mached");
			break;
		}
		driver.manage().window().maximize();
	}

	@Parameters("url")
	@Test
	public void launchApp(String url) {
		System.out.println("launchApp method executed");
		driver.get(url);
	}
	
	@AfterTest
	public void tearDown() {
		System.out.println("tearDown method executed");
		driver.quit();
	}
}
