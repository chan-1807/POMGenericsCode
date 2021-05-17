package com.cg.webdriver.demos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationAPIDemo {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
		System.out.println("Welcome To Selenium WebDriver !!");
		
		System.setProperty("webdriver.chrome.driver", "C:\\D-Backup\\Advanced Selenium Libs\\Latest_Nov_Browser_Drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://demo.opencart.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);

		//OR
		driver.navigate().to("http://demo.opencart.com/index.php?route=product/category&path=57");
				
		Thread.sleep(5000);
			
		driver.navigate().refresh();
				
		Thread.sleep(5000);
				
		driver.navigate().back();
				
		Thread.sleep(5000);
				
		driver.navigate().forward();
				
		Thread.sleep(5000);
				
		driver.quit();
	}
}