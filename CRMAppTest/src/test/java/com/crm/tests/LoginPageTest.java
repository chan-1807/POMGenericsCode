package com.crm.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.crm.pages.HomePage;
import com.crm.pages.LoginPage;
import com.crm.testbase.TestBase;


public class LoginPageTest extends TestBase{
	
	
	@Test
	public void loginPageTitleTest() {
		String title=page.getInstance(LoginPage.class).getPageTitle();
		Assert.assertEquals(title, "CRMPRO  - CRM software for customer relationship management, sales, and support.");
	}
	
	@Test
	public void loginFuncTest() {
		homepage=page.getInstance(LoginPage.class).doLogin("groupautomation", "Test@12345");
		System.out.println(page.getInstance(HomePage.class).getPageTitle());
		
	}

}
