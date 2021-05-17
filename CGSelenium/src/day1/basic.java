package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basic {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chandru\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https:\\www.google.com");
		
		boolean source=driver.getPageSource().contains("google");
		
		if(source==true) {
			System.out.println("Page contains google");
		}
		

		if(source==false) {
			System.out.println("Page does not contains google");
		}
		System.out.println("Current URL is " + driver.getCurrentUrl());
		
		driver.navigate().to("https:\\www.facebook.com");
		
		System.out.println("Current URL is " + driver.getCurrentUrl());
		
		driver.navigate().back();
		
		System.out.println("Current URL is " + driver.getCurrentUrl());
		
		Thread.sleep(1000);
		
		driver.findElement(By.name("q")).sendKeys("Welcome to selenium");
		
		
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]")).click();
		

		//Thread.sleep(1000);
		
		//driver.close();
		
		
	}

}
