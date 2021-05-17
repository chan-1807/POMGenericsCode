package com.cg.webdriver.demos;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class TestWebDriverTSChrome 
{
	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		System.out.println("Welcome To Selenium WebDriver !!");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shbhosle\\Desktop\\Selenium Software\\LatestBrowserDrivers\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in");
		driver.manage().window().maximize();
		
		Boolean b = driver.getPageSource().contains("Google");
		
		if(b==true)
		{
			System.out.println("text 'Google' found");
		}
		else
		{
			System.out.println("text 'Google' not found");
		}
		
		
		System.out.println("Current web page URL is :" + driver.getCurrentUrl());
		
		driver.findElement(By.name("q")).sendKeys("Selenium");
		
		Thread.sleep(5000);
		
		driver.findElement(By.name("btnK")).click();
		
		Thread.sleep(5000);
		
		System.out.println("The page title is : " + driver.getTitle());
		
		driver.close();
	}
}