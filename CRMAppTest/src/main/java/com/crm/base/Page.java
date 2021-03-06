package com.crm.base;

import java.lang.reflect.InvocationTargetException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Page {

	
	public static WebDriver driver;
	WebDriverWait wait;
	
	
	public Page(WebDriver driver) {
		this.driver=driver;
		this.wait=new WebDriverWait(driver, 10);
	}
	
	public abstract String getPageTitle();
	
	public abstract String getPageHeader(By locator);
	
	public abstract WebElement getElement(By locator);
	
	
	public <TPage extends BasePage> TPage getInstance(Class<TPage> pageClass) {
		
		try {
			return pageClass.getDeclaredConstructor(WebDriver.class).newInstance(this.driver);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); 
		}
		return null;
		
	}
	
}
