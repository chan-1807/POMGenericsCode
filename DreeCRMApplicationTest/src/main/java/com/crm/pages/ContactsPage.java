package com.crm.pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.base.CRMBaseClass;

public class ContactsPage extends CRMBaseClass {
	@FindBy(xpath = "//td[contains(text(),'Contacts')]")
	WebElement contactsLabel;
	
	@FindBy(id="first_name")
	WebElement firstName;
	
	@FindBy(id="surname")
	WebElement lastName;
	
	@FindBy(name="client_lookup")
	WebElement company;
	
	@FindBy(xpath = "//input[@type='submit' and @value='Save']")
	WebElement saveBtn;
	
	public ContactsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String contactsLabel(){
		return contactsLabel().toString();
	}
	
	public void selectContact(String name) {
		driver.findElement(By.xpath("//a[@_name='"+name+"']//parent::td//preceding-sibling::td//input")).click();
	}
	
	public void createContact(String fn,String ln, String com ) {
		firstName.sendKeys(fn);
		lastName.sendKeys(ln);
		company.sendKeys(com);
		saveBtn.click();
	}
}
