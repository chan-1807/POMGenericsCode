package day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MulPop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chandru\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("C:\\Users\\Chandru\\Desktop\\SeleniumDemos\\AdvancedSeleniumDemos\\AdvancedSeleniumDemos\\SeleniumWDAPIDemos\\src\\PopUpWinDemo.html");
		
		driver.findElement(By.id("newtab")).click();
		
		String Parent= driver.getWindowHandle();
		
		for(String child: driver.getWindowHandles()) {
			if(!child.equals(Parent)) {
				driver.switchTo().window(child);
				driver.findElement(By.id("alert")).click();
				Alert al= driver.switchTo().alert();
				al.accept();
				System.out.println(driver.getWindowHandle().toString());
			}
		}

	}

}
