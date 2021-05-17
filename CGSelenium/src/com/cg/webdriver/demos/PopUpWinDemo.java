package com.cg.webdriver.demos;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpWinDemo {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\D-Backup\\Advanced Selenium Libs\\Latest_Nov_Browser_Drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	
		driver.manage().window().maximize();	
		
		driver.get("file:///C:/D-Backup/19th_Sep_SeleniumWDCLSDemos/SeleniumWebDriverClsDemos/src/PopUpWinDemo.html");
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("newtab")).click();
		
		String parentWindow=driver.getWindowHandle();
		
		System.out.println("Parent Window: "+parentWindow);
		
		for (String childWindow : driver.getWindowHandles())
		{
		  if(!childWindow.equals(parentWindow))
		 {
						driver.switchTo().window(childWindow);
						driver.findElement(By.id("alert")).click();
						Alert alert=driver.switchTo().alert();
						alert.accept();
						System.out.println("Window: "+childWindow);
		}
		}
		
		for (String childWindow : driver.getWindowHandles())
		{
			if(!childWindow.equals(parentWindow))
			{
				driver.switchTo().window(childWindow);
				break;
			}
		}
		
		Thread.sleep(5000);

		driver.findElement(By.id("alert")).click();
		
		Thread.sleep(5000);
		
		Alert alert=driver.switchTo().alert();
		
		alert.accept();
		
		Thread.sleep(5000);
		
		driver.close();
		
		Thread.sleep(5000);
		
		driver.quit();
	}
}