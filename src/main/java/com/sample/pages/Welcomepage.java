package com.sample.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.sample.base.BaseUI;


public class Welcomepage extends BaseUI {
	
	
	public WebDriver driver;
	public ExtentTest logger;
	
	 By departurefrom=getLocator("departurefrom_css");
    By departureoption=getLocator("departureoption_xpath");
	By destinationto=getLocator("destinationto_xpath");
	By destinationoption=getLocator("destinationoption_xpath");
	By findFlights = getLocator("flights_xpath");
   By ChooseThisFlight=getLocator("ChooseThisFlight_xpath");

	
   public Welcomepage(WebDriver driver,ExtentTest logger) {
		
		this.driver=driver;
		this.logger = logger;
   }
	
	public void DepartureFrom() throws InterruptedException {
		Thread.sleep(5000);
		clickOn(departurefrom,Duration.ofSeconds(30));
		logger.log(Status.INFO, "enter the destination city");
	}
	
	public void departureOption() {
		clickOn(departureoption,Duration.ofSeconds(30));
			
	}
	
	
	public void DestinationTo() {
		clickOn(destinationto,Duration.ofSeconds(30));
		
		
	}
	public void DestinationOption() {
		clickOn(destinationoption,Duration.ofSeconds(30));
	}
	public void clickfindFlight() {
		clickOn(findFlights,Duration.ofSeconds(30));
	}
	 public void Choose_ThisFlight() {
			clickOn(ChooseThisFlight,Duration.ofSeconds(30));
		}

		
	}


		
	

	
		
	





	
		
	




	
		
	
