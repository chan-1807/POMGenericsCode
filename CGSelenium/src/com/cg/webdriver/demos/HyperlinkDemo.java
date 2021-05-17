package com.cg.webdriver.demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperlinkDemo {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.out.println("Welcome To Selenium WebDriver !!");
		
		System.setProperty("webdriver.chrome.driver", "C:\\D-Backup\\Advanced Selenium Libs\\Latest_Nov_Browser_Drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("file:///C:/D-Backup/19th_Sep_SeleniumWDCLSDemos/SeleniumWebDriverClsDemos/src/HyperlinkDemo.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		//Using linkText locator
		driver.findElement(By.linkText("CLICK HERE!")).click();
		Thread.sleep(5000);
				
		driver.navigate().back();
				
		//Using partialLinkText locator
		driver.findElement(By.partialLinkText("ME")).click();

		System.out.println("The page title is : " + driver.getTitle());
		Thread.sleep(5000);
		driver.quit();
	}

}
