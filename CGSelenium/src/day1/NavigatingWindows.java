package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigatingWindows {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chandru\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("C:\\Users\\Chandru\\Desktop\\Se CG Materials\\SeleniumDemos\\AdvancedSeleniumDemos\\AdvancedSeleniumDemos\\SeleniumWDAPIDemos\\src\\PopupWin.html");
		
		String Parent=driver.getWindowHandle().toString();
		
		driver.findElement(By.name("Open")).click();
		Thread.sleep(3000);
		
		driver.switchTo().window("PopupWindow");
		Thread.sleep(3000);
		driver.close();
//		
//		driver.switchTo().window(Parent);
//		Thread.sleep(3000);
//		driver.close();
		
	}

}
