package com.sample.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.sample.base.BaseUI;

public class HomePage extends BaseUI {

	static WebDriver driver;

	static By EmailAddress = getLocator("E-mailAddress_xpath");
	static By password = getLocator("password_xpath");
	static By Login = getLocator("Login_xpath");
	static By Remember = getLocator("Remember_xpath");
	static By ChooseThisFlight =getLocator("ChooseThisFlight_xpath]");
	

	public void EmailAddress(String email) {
		sendText(EmailAddress, email);

	}

	public void password(String Password) {
		sendText(password, Password);

	}

	public void Remember() {
		clickOn(Remember,Duration.ofSeconds(30));
	}

	public void Login() {
		clickOn(Login,Duration.ofSeconds(30));
	}
	

}
