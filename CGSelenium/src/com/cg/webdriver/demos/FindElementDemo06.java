package com.cg.webdriver.demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementDemo06 {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub

		System.out.println("Welcome To Selenium WebDriver !!");
		
		System.setProperty("webdriver.chrome.driver", "C:\\D-Backup\\Advanced Selenium Libs\\Latest_Nov_Browser_Drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://demo.opencart.com/");
		
		Thread.sleep(10000);

		//Featured xpath
		String text=driver.findElement(By.xpath("//*[@id='content']/h3")).getText();
				
		System.out.println("Text : "+text);
				
		System.out.println("\n**************\n\nDiv text:");
				
		//1st Featured div
		System.out.println(driver.findElement(By.xpath("//*[@id='content']/div[2]/div[1]/div")).getText());
				
		driver.quit();
	}
}