package com.CRM.Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	private WebDriver driver;
	
	//intialize driver
	public LoginPage(WebDriver driver) {
		this.driver =  driver;
	}

	
	//Locator
	private By email = By.id("email-id");
	private By pass = By.id("password");
	private By btn = By.id("submit-id");
	
	//method
	public String doLogin(String em, String ps)
	{
		driver.findElement(email).sendKeys(em);
		driver.findElement(pass).sendKeys(ps);
		driver.findElement(btn).click();
		return driver.getCurrentUrl();
	}
	
	
	
	
	
	
}
