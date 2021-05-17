package day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Forms {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chandru\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("C:\\Users\\Chandru\\Desktop\\Se CG Materials\\SeleniumDemos\\AdvancedSeleniumDemos\\AdvancedSeleniumDemos\\SeleniumWDAPIDemos\\src\\WorkingWithForms.html");
		
		WebElement password = null;
		WebElement conpass=null;
		driver.findElement(By.id("txtUserName")).sendKeys("Chandramohan");
		
		password=driver.findElement(By.id("txtPassword"));
		password.sendKeys("pass");
		String pw=driver.findElement(By.id("txtPassword")).getAttribute("value");
		
		
		conpass=driver.findElement(By.id("txtConfPassword"));
		conpass.sendKeys("pass1");
		
	//	Alert al= driver.switchTo().alert()
	//	al.accept();
		
		 
		
		String cp=driver.findElement(By.id("txtConfPassword")).getAttribute("value");
		
		System.out.println("pw is"+pw);
		System.out.println("cp is"+cp);
		
		if(pw.equals(cp)) {
			System.out.println("Valid Password");
		}
		else {
//			WebDriverWait wait= new WebDriverWait(driver,2);
//			wait.until(ExpectedConditions.alertIsPresent());
			driver.findElement(By.id("txtConfPassword")).sendKeys(Keys.TAB);
			Alert al= driver.switchTo().alert();
			al.accept();
			System.out.println("Both password were invalid ");
			cp=pw;
			
		}
		
		System.out.println("pw is"+pw);
		System.out.println("cp is"+cp);
		driver.findElement(By.id("txtConfPassword")).sendKeys(Keys.F11);
		driver.findElement(By.id("txtConfPassword")).sendKeys(Keys.F11);
		driver.findElement(By.id("txtConfPassword")).sendKeys(Keys.F11);
		driver.findElement(By.id("txtConfPassword")).sendKeys(Keys.F5);
		System.out.println("CHECK");
		
		
	}

}
