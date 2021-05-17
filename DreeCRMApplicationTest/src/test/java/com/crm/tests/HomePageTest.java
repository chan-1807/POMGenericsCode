package com.crm.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.base.CRMBaseClass;
import com.crm.pages.ContactsPage;
import com.crm.pages.HomePage;
import com.crm.pages.LoginPage;
import com.crm.util.crmCommonUtilities;

public class HomePageTest extends CRMBaseClass{

	LoginPage loginpage;
	HomePage homepage;
	ContactsPage contactpage;
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialisation();
		loginpage = new LoginPage();
		contactpage=new ContactsPage();
		homepage=loginpage.crmLogin(prop.getProperty("username"), prop.getProperty("password"));
		crmCommonUtilities.switchto("mainpanel");
	}
	
	@Test
	public void contactLinkTest() {
		contactpage=homepage.contactLink();
	}
	
	@Test
	public void newcontactLinkTest() {
		homepage.newContactsLink();
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
