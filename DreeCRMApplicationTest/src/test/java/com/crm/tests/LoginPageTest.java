package com.crm.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.base.CRMBaseClass;
import com.crm.pages.LoginPage;

public class LoginPageTest extends CRMBaseClass{
	LoginPage loginpage;
	
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialisation();
		 loginpage=new LoginPage();
	}
	
	@Test
	public void loginPageTitleTest() {
		String actual=loginpage.pageTitle();
		Assert.assertEquals(actual, "Free CRM  - CRM software for customer relationship management, sales, and support.");
	}
	
	@Test
	public void crmLogoTest() {
		boolean actual=loginpage.crmLogo();
		Assert.assertTrue(actual);
	}
	@Test
	public void crmLoginTest() {
		loginpage.crmLogin(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@AfterMethod
	public void teardown() {
		driver.close();
	}
}
