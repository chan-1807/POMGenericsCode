package com.crm.testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.crm.base.BasePage;
import com.crm.base.Page;
import com.crm.pages.HomePage;
import com.crm.pages.LoginPage;
import com.crm.pages.NewContactPage;

public class TestBase {

	WebDriver driver;
	public Page page;
	public LoginPage loginpage;
	public	HomePage homepage;
	public NewContactPage newcontactpage;
	
	
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chandru\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get("https://classic.crmpro.com/index.html");
		
		page= new BasePage(driver);
	
	}
	
	
	@AfterMethod
	public void teardown() {
		driver.close();
	}
}
