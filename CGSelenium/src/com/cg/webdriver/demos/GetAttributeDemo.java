package com.cg.webdriver.demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeDemo {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.out.println("Welcome To Selenium WebDriver !!");
		
		System.setProperty("webdriver.chrome.driver", "C:\\D-Backup\\Advanced Selenium Libs\\Latest_Nov_Browser_Drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://demo.opencart.com/");
		
		Thread.sleep(5000);
		
		//Desktops xpath
		String attrValue=driver.findElement(By.xpath("//*[@id='menu']/div[2]/ul/li[1]/a")).getAttribute("href");
				
		System.out.println("href: "+attrValue);
				
		driver.get("http://demo.opencart.com/index.php?route=account/register");
				
		Thread.sleep(5000);
				
		WebElement lastName=driver.findElement(By.name("lastname"));
				
		System.out.println("ID: "+lastName.getAttribute("id"));
		System.out.println("Type: "+lastName.getAttribute("type"));
		System.out.println("Placeholder: "+lastName.getAttribute("placeholder"));
		System.out.println("Class: "+lastName.getAttribute("class"));
		System.out.println("Value: "+lastName.getAttribute("value"));
			
		Thread.sleep(5000);
				
		lastName.sendKeys("Gupta");
		Thread.sleep(2000);
		System.out.println("Value: "+lastName.getAttribute("value"));
				
		Thread.sleep(5000);
				
		driver.quit();
	}
}