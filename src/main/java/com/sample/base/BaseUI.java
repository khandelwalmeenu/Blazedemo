package com.sample.base;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.sample.utils.DateUtils;
import com.sample.utils.FileIO;

public class BaseUI {
	public static WebDriver driver;
	public static Properties prop;
	public static String browser_choice;
    public static ExtentReports report;
    public static String timestamp=DateUtils.getTimeStamp();
    public static ExtentTest logger;
	public BaseUI() {
		prop = FileIO.initProperties();
		
	}

	//invoke Browser;
	public static WebDriver invokeBrowser() {
		browser_choice = prop.getProperty("browserName");
		try {
			if (browser_choice.equalsIgnoreCase("firefox")) {
				driver = Browsersetup.getFirefoxdriver();
			} else if (browser_choice.equalsIgnoreCase("edge")) {
				driver = Browsersetup.getEdgedriver();
			} else if (browser_choice.equalsIgnoreCase("chrome")) {
				driver = Browsersetup.getChromedriver();
			} else {
				throw new Exception("Invalid browser name provided in properties");

			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return driver;

	}

	public static void navigateToUrl(String websiteUrlKey) {
		try {
			driver.get(prop.getProperty(websiteUrlKey));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// invoke Browser....
	public static By getLocator(String locatorKey) {
		if(locatorKey.endsWith("_name")) {
			
			return By.name(prop.getProperty(locatorKey));
		}
		
		if (locatorKey.endsWith("_id")) {
			return By.id(prop.getProperty(locatorKey));

		}
		if (locatorKey.endsWith("_class")) {
			return By.className(prop.getProperty(locatorKey));
		}

		if (locatorKey.endsWith("_xpath")) {
			System.out.println(prop.getProperty(locatorKey));
			return By.xpath(prop.getProperty(locatorKey));
		}

		if (locatorKey.endsWith("_css")) {
			return By.cssSelector(prop.getProperty(locatorKey));
		}

		if (locatorKey.endsWith("_linkText")) {
			return By.linkText(prop.getProperty(locatorKey));
		}

		if (locatorKey.endsWith("_partialLinkText")) {
			return By.partialLinkText(prop.getProperty(locatorKey));

		}
		 return null;
		
		
		
		
	}

	// ******check if an element is present****
	public static boolean isElementPresent(By locator, Duration timeout) {
		try {
			new WebDriverWait(driver, timeout).until(ExpectedConditions.presenceOfElementLocated(locator));
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	// ******check if an element is Displayed****
	public static boolean isDisplayed(By locator, Duration timeout) {
		try {
			new WebDriverWait(driver, timeout).until(ExpectedConditions.presenceOfElementLocated(locator));
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	// .....send text to an element...
	/***
	 * 
	 * @param locator
	 * @param text
	 */
	public static void sendText(By locator, String text) {
		try {
			new WebDriverWait(driver, Duration.ofSeconds(30))
					.until(ExpectedConditions.presenceOfElementLocated(locator));
			driver.findElement(locator).clear();
			driver.findElement(locator).sendKeys(text);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/***
	 * 
	 * @param locator
	 * @param option
	 */
		public static void dropdown(By locator,String option) {
			try {
				new WebDriverWait(driver, Duration.ofSeconds(30))
						.until(ExpectedConditions.presenceOfElementLocated(locator));
				
				WebElement dropdown=driver.findElement(locator);
				Select s=new Select(dropdown);
				s.selectByVisibleText(option);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		
	}

	// **** Click on element ****/
		/***
		 */
		
	
		public static void clickOn(By locator, Duration timeout) {

		try {
				new WebDriverWait(driver, timeout).until(ExpectedConditions.elementToBeClickable(locator));
				driver.findElement(locator).click();

			} catch (Exception e) {
				e.printStackTrace();
			}
			}
		public static String screenshot(String name) {
			
			
			
			TakesScreenshot takescr = ((TakesScreenshot)driver);
			File src = takescr.getScreenshotAs(OutputType.FILE);
			
			try {
				FileUtils.copyFile (src, new File(System.getProperty("user.dir") + "/Screenshots/"+name+timestamp+".jpg"));
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			logger.log(Status.INFO, "screenshot is taken");
return System.getProperty("user.dir") + "/Screenshots/"+name+".jpg";
		}
		

			
			
			}
		

		

	

	
	
