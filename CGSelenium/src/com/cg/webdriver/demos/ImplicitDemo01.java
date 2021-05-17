package com.cg.webdriver.demos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitDemo01 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\shbhosle\\Desktop\\Selenium Software\\LatestBrowserDrivers\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		String baseUrl;
		baseUrl = "http://www.wikipedia.org/";
        
       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       
       driver.get(baseUrl + "/wiki/Main_Page");
       driver.findElement(By.id("searchInput01")).clear();
       driver.findElement(By.id("searchInput")).sendKeys("India");
       driver.findElement(By.id("searchButton")).click();
       
       driver.quit();
	}
}