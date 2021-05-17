package com.cg.webdriver.demos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestWebDriverTSFF {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
		System.out.println("Welcome To Selenium WebDriver !!");
		
		/*
		 *  Desired Capabilities help Selenium to understand the browser name, version and operating system 
		 *  to execute the automated tests.
		 *  Initially, we need to set the system property for gecko driver to the geckdriver.exe file download location.
		 *  We need to set the marionette property to true for Selenium to use Marionette protocol to communicate
		 *  with Gecko Driver. Finally, we need to start the Firefox browser instance using the object for Desired Capabilities.
		 */
	
		String driverPath = "C:\\Users\\shbhosle\\Desktop\\Selenium Software\\LatestBrowserDrivers\\geckodriver-v0.26.0-win32\\geckodriver.exe";

		WebDriver driver;

        System.setProperty("webdriver.gecko.driver", driverPath);
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability("marionette", true);
        driver = new FirefoxDriver(capabilities);
        
        driver.get("https://www.google.co.in");
        
        Thread.sleep(5000);
        driver.quit();
	}
}