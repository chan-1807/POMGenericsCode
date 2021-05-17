package com.crm.tests;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.base.CRMBaseClass;
import com.crm.pages.ContactsPage;
import com.crm.pages.HomePage;
import com.crm.pages.LoginPage;
import com.crm.util.ExcelUtils;
import com.crm.util.crmCommonUtilities;

public class ContactsPageTest extends CRMBaseClass{

	
	LoginPage loginpage;
	HomePage homepage;
	ContactsPage contactspage;
	
	
	public ContactsPageTest() {
		super();
	}
	
	@BeforeMethod
	public void Setup() {
		initialisation();
		loginpage=new LoginPage();
		contactspage=new ContactsPage();
		homepage = loginpage.crmLogin(prop.getProperty("username"), prop.getProperty("password"));
		crmCommonUtilities.switchto("mainpanel");
	//	contactspage=homepage.contactLink();
	}
	
	
	
	
	/*
	 * @Test public void selectContactTest() {
	 * contactspage.selectContact("bmala t"); }
	 */
	  @DataProvider
	public Iterator<Object> getData() {
		ArrayList<Object> data=ExcelUtils.testData();
		return data.iterator();
	}
	
	  @Test (dataProvider = "getData")
	  public void createContactTest(String fn,String ln,String cm) {
	//  crmCommonUtilities.switchto("mainpanel");
	  homepage.newContactsLink();
	 // contactspage.createContact("CHAN", "S", "CA");
	  contactspage.createContact(fn, ln, cm);
	  }
	 
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}
