import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

//Selenium Test class for login form of the application

public class TestClass001 {	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		login();

	}
	
	@SuppressWarnings("deprecation")
	@Test
	public static void login() {
	System.setProperty("webdriver.chrome.driver", "E:\\CMS PoCs\\selenium_testing\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://115.124.105.99:6443/humanres/control/main");
	
	System.out.println(new SimpleDateFormat("yyyyMMdd^HHmmss").format(new Date()));
	
	String timeStamp = new SimpleDateFormat("yyyyMMdd^HHmmss").format(new Date()); 
	try {
		Thread.sleep(1000l);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	ScreenCaptureUtility.captureScreenImage(timeStamp+"010");

	//https certificate invalid page
	WebElement button01=driver.findElement(By.id("details-button"));
	button01.click();
	try {
		Thread.sleep(1000l);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	ScreenCaptureUtility.captureScreenImage(timeStamp+"012");

	//proceed to ip server page
	WebElement button02=driver.findElement(By.id("proceed-link"));
	button02.click();
	try {
		Thread.sleep(1000l);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	ScreenCaptureUtility.captureScreenImage(timeStamp+"014");

	//actual login page loading
	System.out.println("check 0023.....");
	WebElement username= driver.findElement(By.xpath("//*[@id=\"content-main-section\"]/center/div/div[3]/form/table/tbody/tr[1]/td/input"));
	WebElement password= driver.findElement(By.xpath("//*[@id=\"content-main-section\"]/center/div/div[3]/form/table/tbody/tr[2]/td/input"));
	
	//submit login button
	WebElement login=driver.findElement(By.xpath("//*[@id=\"content-main-section\"]/center/div/div[3]/form/table/tbody/tr[3]/td/input\r\n" ));	
	
	
	System.out.println("values...."+username+".....bashcbhw...."+password+"......");
	
	CharSequence csequen = "cmstest";
	CharSequence cpwd = "ofbiz321";
	
	username.sendKeys(csequen);
	password.sendKeys(cpwd);
	
	System.out.println("check 0025.....");
	login.click();
	String actualUrl="https://115.124.105.99:6443/humanres/control/main";
	try {
		Thread.sleep(2000l);
	} catch (InterruptedException e) {
	}
	
	String expectedUrl= driver.getCurrentUrl();
	Assert.assertEquals(expectedUrl,actualUrl);
	ScreenCaptureUtility.captureScreenImage(timeStamp+"015");
	
	try {
		Thread.sleep(2000l);
	} catch (InterruptedException e2) {
	
	}
	
	}
}