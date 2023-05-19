package com.testcases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.sample.base.BaseUI;
import com.sample.pages.Welcomepage;
import com.sample.utils.FileIO;
import com.sample.utils.ListenerUtils;

import pom.Homepage;


@Listeners(com.sample.utils.ListenerUtils.class)

public class Welcomepagetest extends BaseUI {
	
	
	 public  WebDriver driver;
	 String[][] testdata;
   

	@BeforeTest
	public void setup() {
		
		driver = invokeBrowser();
		navigateToUrl("websiteURL");
	}
	
	
	@Test(dataProvider="testdata")
	public void enterdeparture(String Boston) throws InterruptedException {
		Welcomepage homepage=new Welcomepage();
		homepage.DepartureFrom();
//		homepage.departureOption();
//		homepage.DestinationTo();
//		homepage.DestinationOption();
//		homepage.clickfindFlight();
//		homepage.Choose_ThisFlight();
		@DataProvider(name="testdata")
		public Object[][] testdata(){
			testdata=FileIO.datahandling("Sheet1");
			return testdata;
	}
	

	}

//@AfterTest
	//public void kill() {
	//driver.close();
		
	
	//	report.flush();
	




