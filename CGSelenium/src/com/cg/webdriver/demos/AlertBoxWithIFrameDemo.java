package com.cg.webdriver.demos;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBoxWithIFrameDemo {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome To Selenium WebDriver !!");
		
		System.setProperty("webdriver.chrome.driver", "C:\\D-Backup\\Advanced Selenium Libs\\Latest_Nov_Browser_Drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("file:///C:/D-Backup/19th_Sep_SeleniumWDCLSDemos/SeleniumWebDriverClsDemos/src/AlertBoxWithIFrameDemo.html");
		
		Thread.sleep(5000);
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("alert")).click();
		
		Thread.sleep(5000);
		
		Alert alert=driver.switchTo().alert();
		
		alert.accept();
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("confirm")).click();
		
		Thread.sleep(5000);
		
		Alert confirm=driver.switchTo().alert();
		
		confirm.accept();
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("confirm")).click();
		
		Thread.sleep(5000);
		
		confirm=driver.switchTo().alert();
		
		confirm.dismiss();
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("prompt")).click();
		
		Thread.sleep(5000);
		
		Alert prompt=driver.switchTo().alert();
		
		String text=prompt.getText();
		System.out.println(text);
		
		prompt.sendKeys("Shubhasmit");
		
		Thread.sleep(5000);
		
		prompt.accept();
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("prompt")).click();
		
		Thread.sleep(5000);
		
		prompt=driver.switchTo().alert();
		
		prompt.dismiss();
		
		Thread.sleep(5000);
		
		driver.quit();
	}
}