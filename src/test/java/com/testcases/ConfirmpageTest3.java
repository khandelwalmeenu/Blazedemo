package com.testcases;

import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.sample.base.BaseUI;
import com.sample.pages.ConfirmationPage3;
import com.sample.pages.Welcomepage;
import com.sample.utils.FileIO;
import com.sample.utils.ListenerUtils;

import pom.Homepage;


@Listeners(com.sample.utils.ListenerUtils.class)

public class ConfirmpageTest3 extends BaseUI {
	
	 WebDriver driver;
	 
	
	 
           

	@BeforeClass
	public void setup(){
		
		driver = invokeBrowser();
		navigateToUrl("websiteURL_c");
	}

		
	
	@Test
public void Screenshot() 
	{
	
	ConfirmationPage3 wlc = new ConfirmationPage3(driver,logger);
	
	try {
		wlc.confirmscreenshot();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}


@AfterClass
	public void kill() {
	driver.close();
		
	
}
	
}



