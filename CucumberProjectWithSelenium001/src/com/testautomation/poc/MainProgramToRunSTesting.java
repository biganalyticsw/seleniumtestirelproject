package com.testautomation.poc;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.testautomation.poc.robots.TestRunRobot;
import com.testautomation.poc.robots.TestRunRobotforChrome;

//Selenium Test class for login form of the application

public class MainProgramToRunSTesting {	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		loadConfig();
		login();

		
	}
	
	private static void loadConfig() {
		// TODO Auto-generated method stub
		
	}

	@SuppressWarnings("deprecation")
	@Test
	public static void login() {
	TestRunRobot tstrrobo = new TestRunRobotforChrome();
		
	tstrrobo.initBrowserDriver();
	WebDriver driver = tstrrobo.getDriver();
	
	tstrrobo.loginForBrowser(driver);
	
	try {
		Thread.sleep(5000l);
	} catch (InterruptedException e2) {
	
	}
	tstrrobo.logoutForBrowser(driver);
	
	
	
	}
}