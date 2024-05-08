package com.CRM.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	//Encapsulation = Identification(Locators) + Actions
	
	
	private WebDriver driver;
	
	//Intializwe driver
	
	public HomePage(WebDriver driver) //base class driver local
	{
		this.driver =  driver;
	}
	
	//Locator
		private By Link = By.linkText("Sign In");
	
	
	//Method
	public String getAppTitle() 
	{
		return driver.getTitle();
	}
		
	public String getAppUrl() {
		
		return driver.getCurrentUrl();
	}
		
	public String getSignIn() {
		 driver.findElement(Link).click();
		 return driver.getCurrentUrl();//login
	}
		
		
		
		
		
		

}
