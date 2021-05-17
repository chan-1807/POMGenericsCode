package day1;

import java.util.List;

import javax.lang.model.element.Element;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class FormsPractice {
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chandru\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("C:\\Users\\Chandru\\Desktop\\Se CG Materials\\SeleniumDemos\\AdvancedSeleniumDemos\\AdvancedSeleniumDemos\\SeleniumWDAPIDemos\\src\\WorkingWithForms.html");
		
		driver.findElement(By.id("txtUserName")).sendKeys("Chandru");
		
		String curusr=driver.findElement(By.id("txtUserName")).getAttribute("value");
		
		System.out.println(curusr);
		
		WebElement usr= driver.findElement(By.id("txtUserName"));
		
		usr.clear();
		
		usr.sendKeys("CHANDRAMOHAN");
		
		curusr=usr.getAttribute("value");
		
		System.out.println(curusr);
		
		driver.findElement(By.id("txtPassword")).sendKeys("password");
		String pw=driver.findElement(By.id("txtPassword")).getAttribute("value");
		
		driver.findElement(By.id("txtConfPassword")).sendKeys("conpass");
		String cpw=driver.findElement(By.id("txtConfPassword")).getAttribute("value");
		
		if(pw.equals(cpw)) {
			System.out.println("passwword match");
		}
		else {
			driver.findElement(By.id("txtConfPassword")).sendKeys(Keys.TAB);
			Alert al= driver.switchTo().alert();
			al.accept();
			System.out.println("matching the confirm password"+cpw+"to password"+pw);
			cpw=pw;
		}
		System.out.println(pw);
		System.out.println(cpw);
		
		List<WebElement> gender = driver.findElements(By.name("gender"));
		
		for(WebElement i:gender) {
			String val;
			val=i.getAttribute("value").toString();
			System.out.println(val);
			if(val.equals("Male")) {
				i.click();
			}
		}
		driver.findElement(By.id("txtConfPassword")).sendKeys(Keys.chord(Keys.LEFT_SHIFT,Keys.TAB));
		
		
}
}
