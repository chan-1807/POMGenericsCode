package demoNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class ASsertion {
	WebDriver driver;
	SoftAssert sa= new SoftAssert();
  @Test
  public void f() {
	  driver.findElement(By.xpath("//*[@id=\"search\"]/span/button")).click();
	  driver.navigate().back();
	  driver.findElement(By.xpath("//*[@id=\"search\"]/input")).clear();
	  driver.findElement(By.xpath("//*[@id=\"search\"]/input")).sendKeys("iphone");
	  String i=driver.findElement(By.xpath("//*[@id=\"search\"]/input")).getAttribute("value");
	  Assert.assertEquals("iphone", i);	 
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chandru\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.get("https://demo.opencart.com/");
	   driver.findElement(By.xpath("//*[@id=\"search\"]/input")).sendKeys("Phones");
		  String enter=driver.findElement(By.xpath("//*[@id=\"search\"]/input")).getText();
		  sa.assertEquals("Phones", enter);
  }

  @AfterTest
  public void afterTest() {
	  driver.manage().window().maximize();
	  driver.navigate().back();
	  driver.close();
  }

}
