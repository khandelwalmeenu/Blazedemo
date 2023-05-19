package com.testcases;



import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.sample.base.BaseUI;
import com.sample.pages.Welcomepage2;
import com.sample.utils.FileIO;




//@Listeners(com.sample.utils.ListenerUtils.class)

public class Welcomepagetest2 extends BaseUI {
	
	
	WebDriver driver;
	String[][] testdata;
   

	@BeforeTest
	public void setup(){
		
		driver = invokeBrowser();
		navigateToUrl("websiteURL");
	}

	
	@Test(priority=1 ,dataProvider="testdata")
	public void enterdeparture() throws InterruptedException  {
		Welcomepage2 homepage=new Welcomepage2(driver, logger);
		homepage.Departurefrom("Boston");
		//homepage.Destinationto();
		//homepage.clickfindFlight();
		//homepage.Choose_ThisFlight();
	}
	@DataProvider(name="testdata")
	public Object[][] testdata() throws IOException{
		testdata=FileIO.datahandling("sheet3");
		return testdata;
	}
	

	}	
	 

//@AfterTest
	//public void kill() {
	//driver.close();
		
	
	
	




