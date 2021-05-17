package com.cg.webdriver.demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitWithAlert {
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shbhosle\\Desktop\\Selenium Software\\LatestBrowserDrivers\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		String baseUrl;
		baseUrl = "file:///C:/Selenium_Demos/AdvancedSeleniumDemos/SeleniumWDAPIDemos/src/AlertExample.html";
		driver.get(baseUrl);
		
		//driver.findElement(By.name("btnAlert")).click();
		
		try
		{
			WebDriverWait wait = new WebDriverWait(driver, 15);
			wait.until(ExpectedConditions.alertIsPresent());
			
			String alrt = driver.switchTo().alert().getText();
			driver.switchTo().alert().accept();
			System.out.print(alrt);
			
			driver.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex);	
		}
	}
}