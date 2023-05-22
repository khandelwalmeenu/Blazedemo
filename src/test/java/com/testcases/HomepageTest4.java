package com.testcases;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.sample.base.BaseUI;
import com.sample.pages.HomePage;
import com.sample.utils.FileIO;

@Listeners(com.sample.utils.ListenerUtils.class)

public class HomepageTest4 extends BaseUI {

	WebDriver driver;
	String[][]testdata;

	@BeforeMethod
	public void setup() {
		driver = invokeBrowser();
		navigateToUrl("websiteURL_L");
	}

	//@Test(enabled = false)
//	public void check_sendText_isenable() {
//		HomePage wlc = new HomePage();
//		assertTrue(wlc.EmailAddress(data[0]).isElementEnabled());
//		assertTrue(wlc.password(data[1]).isElementEnabled());
//		assertTrue(wlc.Remember().isElementEnabled());
//		assertTrue(wlc.Login().isElementEnabled());
//	}
//	//@Test(dependsOnMethods = "entervalid_details",dataProvider="testdata")
//	public void check_sendText_isdisplayed(String[] data) {
//		HomePage wlc = new HomePage();
//		assertTrue(wlc.EmailAddress(data[0]).isDisplayed());
//		assertTrue(wlc.password(data[1]).isDisplayed());
//		assertTrue(wlc.Remember().isDisplayed());
//		assertTrue(wlc.Login().isDisplayed());
//	}
	@Test(priority=1,dataProvider="testdata")
	public void sendText_details(String[] data) {
		HomePage wlc = new HomePage(driver,logger);
		wlc.EmailAddress(data[0]);
		wlc.password(data[1]);
		wlc.Remember();
		wlc.Login();
	}
	@DataProvider(name="testdata")
	public Object[][] testdata() throws IOException{
		testdata=FileIO.datahandling("sheet4");
		return testdata;
	}

//@AfterMethod 
//public void getResult(ITestResult result) {
//	if(result.getStatus()==ITestResult.FAILURE) {
//	logger.log(Status.FAIL,result.getThrowable());
//	}
//	else if (result.getStatus()==ITestResult.SUCCESS) {
//	logger.log(Status.PASS, result.getTestName());
//}
//  else {
//	logger.log(Status.SKIP,result.getTestName());
//	}
//}


@AfterTest
	public void kill() {
	driver.close();
		
	
}
	

}
