package com.crm.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.crm.base.BasePage;

public class NewContactPage extends BasePage{

	public NewContactPage(WebDriver driver) {
		super(driver);
	}

	private By title=By.name("title");
	private By firstname=By.id("first_name");
	private By lastname=By.id("surname");
	private By companyname=By.name("client_lookup");
	private By saveBtn=By.xpath("//input[@type='submit' and @value='Save']");
	
	public WebElement getTitle() {
		return getElement(title);
	}
	public WebElement getFirstname() {
		return getElement(firstname);
	}
	public WebElement getLastname() {
		return getElement(lastname);
	}
	public WebElement getCompanyname() {
		return getElement(companyname);
	}
	public WebElement getSaveBtn() {
		return getElement(saveBtn);
	}

	public void createContact(String tit,String fn, String ln,String comp) {
		Select sel=new Select(getTitle());
		sel.selectByVisibleText(tit);
		getFirstname().sendKeys(fn);
		getLastname().sendKeys(ln);
		getCompanyname().sendKeys(comp);
		getSaveBtn().click();
		
	}
	
	
}
