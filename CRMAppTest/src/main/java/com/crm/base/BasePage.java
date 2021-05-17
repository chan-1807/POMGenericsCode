package com.crm.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage extends Page{

	public BasePage(WebDriver driver) {
		super(driver);
	}

	@Override
	public String getPageTitle() {
		return driver.getTitle();
	}

	@Override
	public String getPageHeader(By locator) {
		return getElement(locator).getText();
	
	}

	@Override
	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void switchto(String fname) {
		driver.switchTo().frame(fname);
	}

}
