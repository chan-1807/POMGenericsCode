package com.cg.webdriver.demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindow {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\D-Backup\\Advanced Selenium Libs\\Latest_Nov_Browser_Drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	
		driver.manage().window().maximize();	
		
		driver.get("file:///C:/D-Backup/19th_Sep_SeleniumWDCLSDemos/SeleniumWebDriverClsDemos/src/PopupWin.html");

		String parentWindow = driver.getWindowHandle().toString();
		Thread.sleep(5000);
		
		driver.findElement(By.name("Open")).click();
		Thread.sleep(5000);
		
		driver.switchTo().window("PopupWindow");
		Thread.sleep(5000);
		driver.close();
		
		driver.switchTo().window(parentWindow);
		Thread.sleep(5000);
		driver.close();
	}
}