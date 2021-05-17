package day1;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chandru\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("C:\\Users\\Chandru\\Desktop\\Se CG Materials\\SeleniumDemos\\AdvancedSeleniumDemos\\AdvancedSeleniumDemos\\SeleniumWDAPIDemos\\src\\PopUpWinDemo.html");
		
		driver.findElement(By.id("newtab")).click();
		
//		Set<String> a = driver.getWindowHandles();
//		
//		for(String i:a) {
//			System.out.println(i);
//		}
		
		String Parent=driver.getWindowHandle().toString();
		
		for(String childWindow :driver.getWindowHandles()) {
			if(!childWindow.equals(Parent)) {
				driver.switchTo().window(childWindow);
				driver.findElement(By.id("alert")).click();
				Alert alert=driver.switchTo().alert();
				alert.accept();
			}
		}
		
	}

}
