package com.cg.webdriver.demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementDemo01 {
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
		System.out.println("Welcome To Selenium WebDriver !!");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shbhosle\\Desktop\\Selenium Software\\LatestBrowserDrivers\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.opencart.com/");

		Thread.sleep(10000);

		WebElement searchBox=driver.findElement(By.name("search"));
		
		//WebElement searchBox=driver.findElement(By.className("form-control input-lg"));
		searchBox.sendKeys("Phone");
		
		Thread.sleep(10000);
		
		driver.quit();

	}
}