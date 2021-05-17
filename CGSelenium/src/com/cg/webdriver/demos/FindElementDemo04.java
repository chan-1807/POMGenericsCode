package com.cg.webdriver.demos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FindElementDemo04 {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.out.println("Welcome To Selenium WebDriver !!");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shbhosle\\Desktop\\Selenium Software\\LatestBrowserDrivers\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Selenium_Demos/AdvancedSeleniumDemos/SeleniumWDAPIDemos/src/WorkingWithForms.html");
		
		Thread.sleep(10000);
		
		WebElement element;	
		
		element = driver.findElement(By.id("txtUserName"));
		element.sendKeys("CG_Smita");
                
        driver.findElement(By.name("txtPwd")).sendKeys("cg@123");
                
        driver.findElement(By.className("Format")).sendKeys("cg@123");
                
        driver.findElement(By.cssSelector("Input.Format1")).sendKeys("Smita");
                
        driver.findElement(By.cssSelector("Input#txtLastName")).sendKeys("Raje");
              
        List<WebElement> radioElem = driver.findElements(By.name("gender"));
        
        for(WebElement webElement : radioElem)
        {
        		String radioSelection;
        		
        		radioSelection = webElement.getAttribute("value").toString();
        		
        		if(radioSelection.equals("Female"))
        		{
        			webElement.click();
        		}
        		        	    			
        		try
        		{
        			Thread.sleep(500);
        		}
        		catch(InterruptedException ex)
        		{
        			System.out.println(ex.getMessage());
        		}	
        }
        
        driver.findElement(By.cssSelector("input[type=date]")).sendKeys("12/12/2009");
        
        driver.findElement(By.cssSelector("input.Format[name='Email']")).sendKeys("smita.raje@capgemini.com");
        
        driver.findElement(By.name("Address")).sendKeys("Mumbai");
        
        Select drpCity = new Select(driver.findElement(By.name("City")));
        
        drpCity.selectByIndex(0);
        drpCity.selectByValue("Pune1");
        drpCity.selectByVisibleText("Chennai");
                
        List<WebElement> checkElem = driver.findElements(By.name("chkHobbies"));
        
        for(WebElement webElement : checkElem)
        {
        		String checkSelection;
        		checkSelection = webElement.getAttribute("value").toString();
        		if(checkSelection.equals("Music"))
        		{
        			webElement.click();
        		}
        		        	    			
        		try
        		{
        			Thread.sleep(500);
        		}
        		catch(InterruptedException ex)
        		{
        			System.out.println(ex.getMessage());
        		}	
        }
        
        Thread.sleep(5000);
	}
}