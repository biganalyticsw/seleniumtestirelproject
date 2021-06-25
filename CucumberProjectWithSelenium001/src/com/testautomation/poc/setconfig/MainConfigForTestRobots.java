package com.testautomation.poc.setconfig;

import java.io.IOException;

import org.eclipse.jetty.xml.XmlConfiguration;
import org.xml.sax.SAXException;

public class MainConfigForTestRobots {

	public MainConfigForTestRobots() throws Exception {
		// TODO Auto-generated constructor stub
		
		 XmlConfiguration configCreate;
		try {
			configCreate = new XmlConfiguration(MainConfigFile.getMainconfigFilepathStr());
			configCreate.configure(MainConfigFile.getMainconfigFilepathStr());
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
