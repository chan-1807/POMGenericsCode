package com.cg.webdriver.demos;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitForPageLoadDemo01 {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\D-Backup\\Advanced Selenium Libs\\Latest_Nov_Browser_Drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	
		driver.manage().window().maximize();
		
		Date startdate=new Date();
		System.out.println(startdate.toLocaleString());
		
		driver.get("http://demo.opencart.com/");
		
		//Sets the amount of time to wait for a page load to complete before throwing
		//an error. If the timeout is negative, page loads can be indefinite
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		WebElement searchBox=driver.findElement(By.name("search"));
		
		searchBox.sendKeys("Phone");
		
		driver.findElement(By.className("input-group-btn")).click();
		
		Thread.sleep(5000);
		
		driver.quit();
		Date enddate=new Date();

		System.out.println(enddate.toLocaleString());
	}
}