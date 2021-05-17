package com.cg.webdriver.demos;

import org.openqa.selenium.*;
import org.openqa.selenium.ie.*;

public class TestWebDriverTSIE 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		System.out.println("Welcome To Selenium WebDriver !!");
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\shbhosle\\Desktop\\Selenium Software\\LatestBrowserDrivers\\IEDriverServer_Win32_3.150.1\\IEDriverServer.exe");	

		WebDriver driver = new InternetExplorerDriver();
		
		driver.get("https://www.google.co.in");
		
		Thread.sleep(5000);
		
		driver.close();
	}
}
