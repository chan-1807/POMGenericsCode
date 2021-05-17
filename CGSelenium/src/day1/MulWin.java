package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MulWin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chandru\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("C:\\Users\\Chandru\\Desktop\\SeleniumDemos\\AdvancedSeleniumDemos\\AdvancedSeleniumDemos\\SeleniumWDAPIDemos\\src\\PopupWin.html");
		
		String cur=driver.getWindowHandle();
		
		System.out.println(cur);
		
		driver.findElement(By.name("Open")).click();
		driver.switchTo().window("PopupWindow");
		String chi=driver.getWindowHandle().toString();
	
		System.out.println(chi);
		driver.quit();
		
		//driver.switchTo().window(cur);
		
		
		

	}

}
