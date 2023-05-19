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
	
	 By departurefrom=getLocator("departurefrom_css");
    By departureoption=getLocator("departureoption_xpath");
	By destinationto=getLocator("destinationto_xpath");
	By destinationoption=getLocator("destinationoption_xpath");
	By findFlights = getLocator("flights_xpath");
   By ChooseThisFlight=getLocator("ChooseThisFlight_xpath");

	
	
	
	public void DepartureFrom() throws InterruptedException {
		Thread.sleep(5000);
		clickOn1(departurefrom,Duration.ofSeconds(5000));
	}
	
	public void departureOption() {
		clickOn1(departureoption,Duration.ofSeconds(5000));
			
	}
	
	
	public void DestinationTo() {
		clickOn1(destinationto,Duration.ofSeconds(5000));
		
		
	}
	public void DestinationOption() {
		clickOn1(destinationoption,Duration.ofSeconds(5000));
	}
	public void clickfindFlight() {
		clickOn1(findFlights,Duration.ofSeconds(5000));
	}
	 public void Choose_ThisFlight() {
			clickOn1(ChooseThisFlight,Duration.ofSeconds(30));
		}

		
	}


		
	

	
		
	





	
		
	




	
		
	
