package com.crm.tests;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.pages.LoginPage;
import com.crm.testbase.TestBase;
import com.crm.util.Utilities;

public class ContactPageTest extends TestBase {

	@DataProvider
	public Iterator<Object> getData() {
		ArrayList<Object> data=Utilities.getDataFromExcel();
		return data.iterator();
	}
	
	@Test(dataProvider = "getData")
	public void createContactTest(String title,String firstname,String lastname,String company) {
		homepage=page.getInstance(LoginPage.class).doLogin("groupautomation", "Test@12345");
		newcontactpage=homepage.newCotactLink();
		//newcontactpage.createContact("Mr.", "CHANDRA", "SELVA", "CA");
		newcontactpage.createContact(title, firstname, lastname, company);
	}
}
