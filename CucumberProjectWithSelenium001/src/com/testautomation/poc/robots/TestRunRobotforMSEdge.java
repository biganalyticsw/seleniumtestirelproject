package com.testautomation.poc.robots;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import com.testautomation.poc.util.ScreenCaptureUtilityinPacCHR;

import junit.framework.Assert;

public class TestRunRobotforMSEdge extends TestRunRobot {

	private WebDriver driver;

	private String timeStamp = "";

	@SuppressWarnings("deprecation")
	public TestRunRobotforMSEdge() {
		// TODO Auto-generated constructor stub
		System.setProperty("webdriver.edge.driver", "E:\\CMS PoCs\\selenium_testing\\msedgedriver.exe");

		driver = new EdgeDriver();
		// Specifiying pageLoadTimeout and Implicit wait
	//	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		this.setDriver(driver);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void initBrowserDriver() {

		//System.setProperty("webdriver.edge.driver", "E:\\CMS PoCs\\selenium_testing\\msedgedriver.exe");

		//driver = new EdgeDriver();
		// Specifiying pageLoadTimeout and Implicit wait
		//driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// this.setDriver(driver);
		driver.manage().window().maximize();
		driver.get("https://115.124.105.99:6443/humanres/control/main");

		System.out.println(new SimpleDateFormat("yyyyMMdd^HHmmss").format(new Date()));

		timeStamp = new SimpleDateFormat("yyyyMMdd^HHmmss").format(new Date());
		try {
			Thread.sleep(1000l);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ScreenCaptureUtilityinPacCHR.captureScreenImage(timeStamp + "010msedge");

		// https certificate invalid page
		WebElement button01 = driver.findElement(By.id("details-button"));
		button01.click();
		try {
			Thread.sleep(1000l);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		ScreenCaptureUtilityinPacCHR.captureScreenImage(timeStamp + "012msedge");

		// proceed to ip server page
		WebElement button02 = driver.findElement(By.id("proceed-link"));
		button02.click();
		try {
			Thread.sleep(1000l);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		ScreenCaptureUtilityinPacCHR.captureScreenImage(timeStamp + "014msedge");

		// actual login page loading
		System.out.println("check 0023.....");
	}

	public void runRobotForBrowser() {
		System.out.println("Calling method runRobotForBrowser in TestRunRobot ");
	}

	@SuppressWarnings("deprecation")
	public void loginForBrowser(WebDriver driver) {
		WebElement username = driver.findElement(
				By.xpath("//*[@id=\"content-main-section\"]/center/div/div[3]/form/table/tbody/tr[1]/td/input"));
		WebElement password = driver.findElement(
				By.xpath("//*[@id=\"content-main-section\"]/center/div/div[3]/form/table/tbody/tr[2]/td/input"));

		// submit login button
		WebElement login = driver.findElement(
				By.xpath("//*[@id=\"content-main-section\"]/center/div/div[3]/form/table/tbody/tr[3]/td/input\r\n"));

		System.out.println("values...." + username + ".....bashcbhw...." + password + "......");

		CharSequence csequen = "cmstest";
		CharSequence cpwd = "ofbiz321";

		username.sendKeys(csequen);
		password.sendKeys(cpwd);

		System.out.println("check 0025.....");
		login.click();
		String actualUrl = "https://115.124.105.99:6443/humanres/control/main";
		try {
			Thread.sleep(2000l);
		} catch (InterruptedException e) {
		}
		ScreenCaptureUtilityinPacCHR.captureScreenImage(timeStamp + "015msedge");

		String expectedUrl = driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl, actualUrl);

	}

	@SuppressWarnings("deprecation")
	public void logoutForBrowser(WebDriver driver) {
		ScreenCaptureUtilityinPacCHR.captureScreenImage(timeStamp + "016msedge");

		WebElement logoutBtn = driver.findElement(By.xpath("//*[@id=\"preferences-menu\"]/tbody/tr/td[3]/a[2]"));
		logoutBtn.click();

		try {
			Thread.sleep(2000l);
		} catch (InterruptedException e) {
		}
		ScreenCaptureUtilityinPacCHR.captureScreenImage(timeStamp + "017msedge");

	}

	public void closeBrowserDriver() {

		try {
			driver.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
