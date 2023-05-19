package com.sample.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.sample.base.BaseUI;


public class Welcomepage2 extends BaseUI {
	
	public ExtentTest logger;
	
	public WebDriver driver;
	
	 By departurefrom=getLocator("departurefrom_name");
   
	By destinationto=getLocator("destinationto_xpath");
	
	By findFlights = getLocator("flights_xpath");
   By ChooseThisFlight=getLocator("ChooseThisFlight_xpath");

	
	public Welcomepage2(WebDriver driver,ExtentTest logger) {
		
		this.driver=driver;
		this.logger = logger;
	}
	
	public void Departurefrom(String Boston) throws InterruptedException  {
		Thread.sleep(5000);
		sendText(departurefrom,Boston);
	}
	
//	public void Destinationto() throws InterruptedException {
//		Thread.sleep(5000);
//		clickOn(destinationto);
//		//logger.log(Status.INFO, "enter the destination city");
//		
//	}
//	
//	public void clickfindFlight() {
//		clickOn(findFlights);
//	}
//	 public void Choose_ThisFlight() {
//			clickOn(ChooseThisFlight);
//		}

		
	}



		
	

	
		
	





	
		
	




	
		
	
