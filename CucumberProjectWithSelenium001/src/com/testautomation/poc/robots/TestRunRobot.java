package com.testautomation.poc.robots;

import org.openqa.selenium.WebDriver;

public abstract class TestRunRobot {

	public TestRunRobot() {
		System.out.println("Calling constructor in TestRunRobot AC ");
		// TODO Auto-generated constructor stub
	}

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub

	}*/
	
	public abstract void initBrowserDriver();
	
	public abstract WebDriver getDriver();
	
	public abstract void loginForBrowser(WebDriver driver);
	
	public abstract void logoutForBrowser(WebDriver driver);
	
	public abstract void runRobotForBrowser();
	
	public abstract void closeBrowserDriver();

}
