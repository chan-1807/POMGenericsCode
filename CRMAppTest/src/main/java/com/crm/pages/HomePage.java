package com.crm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.crm.base.BasePage;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	private By contactBtn= By.xpath("//a[contains(text(),'Contacts')]");
	private By userNameArea=By.xpath("//td[contains(text(),'User:')]");
	private By newContactBtn=By.xpath("//a[contains(text(),'New Contact')]");
	
	public WebElement getContactBtn() {
		return getElement(contactBtn);
	}
	public WebElement getUserNameArea() {
		return getElement(userNameArea);
	}
	public WebElement getNewContactBtn() {
		return getElement(newContactBtn);
	}
	
	public boolean contactLinkPresent() {
		switchto("mainpanel");
		return getContactBtn().isDisplayed();
	}
	
	public void contactLink() {
		switchto("mainpanel");
		getContactBtn().click();
	}
	
	public boolean usernamePresent() {
		switchto("mainpanel");
		 return getUserNameArea().isDisplayed();
	}
	

	public NewContactPage newCotactLink() {
		switchto("mainpanel");
		Actions act=new Actions(driver);
		act.moveToElement(getContactBtn()).build().perform();
		getNewContactBtn().click();
		return getInstance(NewContactPage.class);
	}
}
