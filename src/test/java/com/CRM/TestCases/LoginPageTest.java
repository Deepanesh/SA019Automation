package com.CRM.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.CRM.Pages.LoginPage;

public class LoginPageTest extends BaseClass
{
  @Test
  public void validateLogin() 
  {
	String nextPageUrl = lp.doLogin("test@gmail.com", "test123");
	Assert.assertTrue(nextPageUrl.contains("customer"),"Test Fail: Login Failed");
	System.out.println("Test Pass: Login Completed!");
  }
}
