package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.base.CRMBaseClass;
import com.crm.util.crmCommonUtilities;

public class HomePage extends CRMBaseClass{

	@FindBy(xpath ="//a[contains(text(),'Contacts')]")
	WebElement contactsBtn;
	
	@FindBy(xpath = "//a[contains(text(),'New Contact')]")
	WebElement newContactBtn;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public ContactsPage contactLink() {
		contactsBtn.click();
		return new ContactsPage();
	}
	
	public void newContactsLink() {
		Actions act= new Actions(driver);
		act.moveToElement(contactsBtn).build().perform();
		newContactBtn.click();
	}
}

