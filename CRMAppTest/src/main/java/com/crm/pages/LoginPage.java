package com.crm.pages;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.crm.base.BasePage;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	private By username= By.name("username");
	private By password=By.name("password");
	private By loginBtn=By.xpath("//input[@type='submit' and @value='Login']");
	
	
	public WebElement getUsername() {
		return getElement(username);
	}
	public WebElement getPassword() {
		return getElement(password);
	}
	public WebElement getLoginBtn() {
		return getElement(loginBtn);
	}
	
	
	public HomePage doLogin(String username, String password) {
		getUsername().sendKeys(username);
		getPassword().sendKeys(password);
		getLoginBtn().click();
		return getInstance(HomePage.class);
	}
	
}
