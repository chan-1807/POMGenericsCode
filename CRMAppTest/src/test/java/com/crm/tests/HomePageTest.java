package com.crm.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.crm.base.Page;
import com.crm.pages.LoginPage;
import com.crm.testbase.TestBase;

public class HomePageTest extends TestBase {

	@Test
	public void usernameTest() {
		homepage=page.getInstance(LoginPage.class).doLogin("groupautomation", "Test@12345");
		boolean flag=homepage.usernamePresent();
		Assert.assertTrue(flag);
	}
	
	@Test
	public void contactLinkPresentTest() {
		homepage=page.getInstance(LoginPage.class).doLogin("groupautomation", "Test@12345");
		boolean flag=homepage.contactLinkPresent();
		Assert.assertTrue(flag);
	}
	
	@Test
	public void contactLinkTest() {
		homepage=page.getInstance(LoginPage.class).doLogin("groupautomation", "Test@12345");
		homepage.contactLink();
	}
	
	@Test
	public void newContactLinkTest() {
		homepage=page.getInstance(LoginPage.class).doLogin("groupautomation", "Test@12345");
		homepage.newCotactLink();
	}
}
