package com.testcases;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.sample.base.BaseUI;
import com.sample.pages.Reservepage;
import com.sample.utils.FileIO;

@Listeners(com.sample.utils.ListenerUtils.class)

public class Reservepagetest2 extends BaseUI {


	WebDriver driver;
	String[][] testdata;
	
	@BeforeClass
	
	public void setup() {
		driver = invokeBrowser();
		navigateToUrl("websiteURL_R");
		
	}
	


	@Test(priority=1 ,dataProvider="testdata")
	public void sendText(String data[]) throws InterruptedException {
		Reservepage hp = new Reservepage();

		hp.Name(data[0]);
		hp.Address(data[1]);
		hp.City(data[2]);
		hp.State(data[3]);
		hp.Zip_Code(data[4]);
		hp.Credit_CardNumber(data[5]);
		hp.Month(data[6]);
		hp.Year(data[7]);
		hp.NameOn_Card(data[8]);
		hp.Remember_Me();
		Thread.sleep(5000);
		hp.purchase_Flight();
	}
	@DataProvider(name="testdata")
	public Object[][] testdata() throws IOException{
		testdata=FileIO.datahandling("sheet2");
		return testdata;
	}
@AfterClass
	public void kill() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();

		
	}
}

