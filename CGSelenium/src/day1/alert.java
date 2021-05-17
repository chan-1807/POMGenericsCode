package day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chandru\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Chandru/Desktop/SeleniumDemos/AdvancedSeleniumDemos/AdvancedSeleniumDemos/SeleniumWDAPIDemos/src/AlertBoxDemos.html");
		
		driver.findElement(By.id("alert")).click();
		Alert al= driver.switchTo().alert();
		
		String ale= al.getText();
		System.out.println(ale);
		
		al.accept();
		
		
	}

}
