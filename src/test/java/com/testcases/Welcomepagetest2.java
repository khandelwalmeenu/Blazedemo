package com.testcases;



import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.sample.base.BaseUI;
import com.sample.pages.Welcomepage2;
import com.sample.utils.FileIO;




@Listeners(com.sample.utils.ListenerUtils.class)

public class Welcomepagetest2 extends BaseUI {
	
	
	WebDriver driver;
	String[][] testdata;
   

	@BeforeClass
	public void setup(){
		
		driver = invokeBrowser();
		navigateToUrl("websiteURL");
		
	}

	
	@Test(priority=1 ,dataProvider="testdata")
	public void enterdeparture(String Boston,String london) throws InterruptedException  {
		Welcomepage2 homepage=new Welcomepage2(driver, logger);
		homepage.Departurefrom(Boston);
		homepage.Destinationto(london);
		homepage.clickfindFlight();
		
		homepage.Choose_ThisFlight();
		
	}
	@DataProvider(name="testdata")
	public Object[][] testdata() throws IOException{
		testdata=FileIO.datahandling("Sheet3");
		return testdata;
	}
	@AfterClass
	public void kill() {
	driver.close();
}
}
		
	
	
	




