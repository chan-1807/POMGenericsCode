package com.cg.webdriver.demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SynchronizationDemo {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\D-Backup\\Advanced Selenium Libs\\Latest_Nov_Browser_Drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://demo.opencart.com/");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id='top-links']/ul/li[2]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='top-links']/ul/li[2]/ul/li[1]/a")).click();
		Thread.sleep(10000);
		
		driver.findElement(By.id("input-lastname")).sendKeys("Text");
		Thread.sleep(5000);
		
		Select selectCountry=new Select(driver.findElement(By.id("input-country")));
		selectCountry.selectByIndex(2);
		Select selectState=new Select(driver.findElement(By.id("input-zone")));
		selectState.selectByValue("32");
		Thread.sleep(5000);
		driver.quit();
	}
}