package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.base.CRMBaseClass;

public class LoginPage extends CRMBaseClass {
	
	
	@FindBy(name = "username")
	WebElement uname;
	
	@FindBy(name = "password")
	WebElement pass;
	
	@FindBy(css = "input.btn")
	WebElement loginBtn;
	
	@FindBy(xpath = "//a[@class='navbar-brand']//img[@class='img-responsive']")
	WebElement crmLogo;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public String pageTitle() {
		String title=driver.getTitle();
		return title;
		
	}
	
	public Boolean crmLogo() {
		return crmLogo.isDisplayed();
	}
	
	public HomePage crmLogin(String un,String pss) {
		uname.sendKeys(un);
		pass.sendKeys(pss);
		loginBtn.click();
		return new HomePage();
	}
}
