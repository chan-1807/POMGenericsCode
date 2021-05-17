package com.cg.webdriver.demos;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitNImplicitDemo01 {
	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\D-Backup\\Advanced Selenium Libs\\Latest_Nov_Browser_Drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("http://demo.opencart.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		WebElement searchBox;
		
		WebDriverWait wait=new WebDriverWait(driver, 10);
				
		Date strtdate=new Date();
		System.out.println(strtdate);
		searchBox=wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("search2")));	
		Date endDate=new Date();
		System.out.println(endDate);
		searchBox.sendKeys("Phone");
				
		driver.findElement(By.className("input-group-btn")).click();		
				
		driver.quit();
	}
}
