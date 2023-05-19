package com.sample.pages;


import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import com.sample.base.BaseUI;

public class Reservepage extends BaseUI {
	
	 static WebDriver driver;
	
	
	static By Name=getLocator("Name_id");
	static By Address=getLocator("Address_xpath");
	static By City=getLocator("City_xpath");
	static By State=getLocator("State_xpath");	
	static By ZipCode=getLocator("ZipCode_xpath");
	static By CardType=getLocator("CardType_xpath");
	static By CreditCardNumber=getLocator("CreditCardNumber_xpath");
	static By Month=getLocator("Month_id");
	static By Year=getLocator("Year_id");
	static By NameOnCard=getLocator("NameOnCard_xpath");
	static By RememberMe=getLocator("RememberMe_xpath");
	static By purchaseFlight=getLocator("purchaseFlight_xpath");
	

	   
		
		public void Name(String name) {
			sendText(Name,name);
			
		}
		public void  Address(String address) {
			sendText(Address,address);
		}
		public void City(String city) {
			sendText(City ,city);
	}
		public void State(String state) {
			sendText(State,state);
		}
		public void Zip_Code(String zipcode) {
			sendText(ZipCode,zipcode);
		}
		public void Card_Type(String cardtype) {
			dropdown(CardType,cardtype);
		}

		public void Credit_CardNumber(String cardnumber) {
			sendText(CreditCardNumber,cardnumber);
		}
		

		public void Month(String month) {
			sendText(Month , month);
		}

		public void Year(String year) {
			sendText(Year , year);
		}

		public void NameOn_Card(String nameoncard) {
			sendText(NameOnCard , nameoncard);
		}
		public void Remember_Me() {
			clickOn(RememberMe,Duration.ofSeconds(10));
		}
		public void purchase_Flight() {
			clickOn(purchaseFlight,Duration.ofSeconds(10));
		}
	
		
		
	
		
		}


//properties.setProperty("prop1", "Value1");
//properties.setProperty("prop2", "Value2");
//properties.store(outputStream, null);
//FileOutputStream fr = new FileOutputStream(file);
        //p.store(fr, "Properties");\
		



