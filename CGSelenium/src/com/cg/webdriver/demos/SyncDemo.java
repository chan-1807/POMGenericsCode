package com.cg.webdriver.demos;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SyncDemo {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\D-Backup\\Advanced Selenium Libs\\Latest_Nov_Browser_Drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		Date startdate=new Date();
		
		//Use the driver to visit the URL
		
		driver.get("http://demo.opencart.com/");
				
		//Wait for 10 sec
		Thread.sleep(10000);
				
		//Find the search box using name
		WebElement searchBox=driver.findElement(By.name("search"));
				
		//Type DATA in the search box
				searchBox.sendKeys("Phone");
				
				//Wait for 5 sec
				Thread.sleep(5000);
				
				//Find the search button and click on it
				driver.findElement(By.xpath("//*[@id='search']/span/button")).click();
				
				//Wait for 10 sec
				Thread.sleep(10000);

	}
}