package com.CRM.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.CRM.Pages.HomePage;

public class HomePageTest extends BaseClass
{
		
  @Test (priority = 1)
  public void validateURL() 
  {

	String actUrl = hp.getAppUrl();
	Assert.assertTrue(actUrl.contains("crm"), "Test Fail: URL  Not Matched!");
	System.out.println("Test pass: URL Matched!");
  }
  @Test(priority = 2)
  public void validateTitle() 
  {

	  String actTitle = hp.getAppTitle();
	   Assert.assertTrue(actTitle.contains("Customer Service"), "Test Fail: Title Not matched!");
	   System.out.println("Test Pass: Title matched!");
  }
  
  @Test(priority = 3)
  public void validateSignIn() 
  {
	String actUrl = hp.getSignIn();
	Assert.assertTrue(actUrl.contains("crm"), "Test Fail: Url Not mached!");
	System.out.println("Test pass: URL macted!");
	
  }

}
