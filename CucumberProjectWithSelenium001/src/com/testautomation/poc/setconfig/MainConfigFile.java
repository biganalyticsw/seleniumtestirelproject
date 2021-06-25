package com.testautomation.poc.setconfig;

import javax.xml.bind.annotation.XmlElement;  
import javax.xml.bind.annotation.XmlRootElement;  

import org.apache.commons.*;

@XmlRootElement
public class MainConfigFile {

	public static String getMainconfigFilepathStr() {
		return mainconfigFilepathStr;
	}


	public static void setMainconfigFilepathStr(String mainconfigFilepathStr) {
		MainConfigFile.mainconfigFilepathStr = mainconfigFilepathStr;
	}


	public String getFilePathStr() {
		return filePathStr;
	}


	public void setFilePathStr(String filePathStr) {
		this.filePathStr = filePathStr;
	}


	public String getFileNameStr() {
		return fileNameStr;
	}


	public void setFileNameStr(String fileNameStr) {
		this.fileNameStr = fileNameStr;
	}

	private static String mainconfigFilepathStr = "placeholder";
	
	private String filePathStr = "E:\\CMS PoCs\\selenium_testing\\workspace01\\config\\xmlfiles\\";
	
	private String fileNameStr = "main_config.xml";
	 
	public String fileNameStrCombined=""+filePathStr+fileNameStr;
	
	
	public String getFileNameStrCombined() {
		return fileNameStrCombined;
	}


	public void setFileNameStrCombined(String fileNameStrCombined) {
		this.fileNameStrCombined = fileNameStrCombined;
	}


	public MainConfigFile() {
	}
	
	
	public MainConfigFile(String filePathStr) {
		
		 	super();  
		    this.fileNameStr = filePathStr+fileNameStr;  
		// TODO Auto-generated constructor stub
		    setFileNameStrCombined(fileNameStrCombined);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	

}
