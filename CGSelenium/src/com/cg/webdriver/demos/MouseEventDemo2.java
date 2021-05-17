package com.cg.webdriver.demos;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.chrome.*;

public class MouseEventDemo2 {

	public static void main(String[] args)
	{
		// Building series of multiple actions
		System.setProperty("webdriver.chrome.driver","C:/Selenium Libs - Latest/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		
		WebElement element = driver.findElement(By.name("q"));
		
		Actions builder = new Actions(driver);
		Action seriesOfActions = builder
				.moveToElement(element)
				.click()
				.keyDown(element,Keys.SHIFT)
				.sendKeys(element,"Selenium")
				.keyUp(element,Keys.SHIFT)
				.doubleClick(element)
				.contextClick()
				.build();
		seriesOfActions.perform();
		
		//driver.close();
	}
}