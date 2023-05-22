package com.sample.pages;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.sample.base.BaseUI;

public class ConfirmationPage3 extends BaseUI {
	
	public  ExtentTest logger;
	
	public WebDriver driver;
	 
	
	public void setup() throws IOException {
		driver = invokeBrowser();
		navigateToUrl("websiteURL_c");
	}
	
	
	public ConfirmationPage3 (WebDriver driver,ExtentTest logger)  {
		
		this.driver=driver;
		this.logger = logger;
	}
	public void confirmscreenshot() throws IOException{
		screenshot("confirm");
		
		
		
	}
}
	
//public static String getscreenshot(String name,TakesScreenshot tsrc) {
//	try {
//		String repname=name+BaseUI.Date+".jpg";
//		File source = tsrc.getScreenshotAs(OutputType.FILE);
//		Screenshot_file_destination= System.getProperty("user.dir") + "/Screenshots/"+repname;
//		File finalDestination = new File(Screenshot_file_destination);
//		FileUtils.copyFile(source, finalDestination);
//		return Screenshot_file_destination;
//	 
//	}
//		catch(Exception e) {
//			e.printStackTrace();
//			return null;
//			
//		}



