package com.testautomation.poc.newpages;

import com.testautomation.poc.robots.TestRunRobot;

public class OpenandTestNewPage {
	
	public OpenandTestNewPage(String httpurlStr, TestRunRobot testRunRobot) {
		super();
		this.httpurlStr = httpurlStr;
		this.testRunRobot = testRunRobot;
	}

	private  String httpurlStr = "";
	private  TestRunRobot testRunRobot= null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String getHttpurlStr() {
		return httpurlStr;
	}

	public void setHttpurlStr(String httpurlStr) {
		this.httpurlStr = httpurlStr;
	}

	public TestRunRobot getTestRunRobot() {
		return testRunRobot;
	}

	public void setTestRunRobot(TestRunRobot testRunRobot) {
		this.testRunRobot = testRunRobot;
	}
	
	
	

}
