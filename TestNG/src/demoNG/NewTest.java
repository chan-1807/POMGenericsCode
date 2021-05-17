package demoNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class NewTest {
	WebDriver driver;
	SoftAssert sa= new SoftAssert();
  @Test
  public void a() {
	  driver.findElement(By.xpath("//*[@id=\"search\"]/span/button")).click();
	  driver.navigate().back();
	  driver.findElement(By.xpath("//*[@id=\"search\"]/input")).clear();
	  driver.findElement(By.xpath("//*[@id=\"search\"]/input")).sendKeys("iphone");
	  String i=driver.findElement(By.xpath("//*[@id=\"search\"]/input")).getText();
	 // Assert.assertEquals("iphone", i);	  
	  sa.assertEquals("ch", i);
	  System.out.println("AFTER FAILURE");
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chandru\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.get("https://demo.opencart.com/");
  }
  @BeforeMethod
  public void beforemethod() {
	  
	  driver.findElement(By.xpath("//*[@id=\"search\"]/input")).sendKeys("Phones");
	  String enter=driver.findElement(By.xpath("//*[@id=\"search\"]/input")).getAttribute("value");
	  Assert.assertEquals("Phones", enter);
  }

  @Test
  public void afterMethod() {
	  sa.assertEquals("YOUR", driver.getTitle());
	  driver.manage().window().maximize();
	  driver.navigate().back();
	  
  }
  @AfterClass
  public void afterClass() {
	driver.close();
	sa.assertAll();
  }
}
