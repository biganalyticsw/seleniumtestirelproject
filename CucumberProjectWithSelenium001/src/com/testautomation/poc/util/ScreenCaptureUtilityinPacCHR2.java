package com.testautomation.poc.util;
import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
 
import javax.imageio.ImageIO;
 
public class ScreenCaptureUtilityinPacCHR2 {
	
	private static final String filePath = "E:\\CMS PoCs\\selenium_testing\\logscreenimages\\";
	
	public static void captureScreenImage(String timeStamp) {
        try {
        	
        	String sTimeStamp = timeStamp;
        			//timeStamp.replaceAll(":", "unscore");
        	
        	System.out.println("Time stamp........"+sTimeStamp);
            Robot robot = new Robot();
            String format = "jpg";
            String fileName = sTimeStamp+ "." + format;
             
            Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            BufferedImage screenFullImage = robot.createScreenCapture(screenRect);
            ImageIO.write(screenFullImage, format, new File(filePath + fileName));
             
            System.out.println("A full screenshot saved!");
        } catch (AWTException | IOException ex) {
            System.err.println(ex);
        }
    }	
	
	

}


