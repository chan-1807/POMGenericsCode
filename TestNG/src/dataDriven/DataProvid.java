package dataDriven;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvid {
	WebDriver driver;
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chandru\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		
		 driver=new ChromeDriver();
		
		driver.get("C:\\Users\\Chandru\\Desktop\\Se CG Materials\\SeleniumDemos\\AdvancedSeleniumDemos\\AdvancedSeleniumDemos\\SeleniumWDAPIDemos\\src\\WorkingWithForms.html");
	}
	@DataProvider
	public Iterator<Object[]> datamethod() {
		ArrayList<Object[]> testdata=TestUtil.datamethod();
		return testdata.iterator();
		
		
	}
  @Test(dataProvider="datamethod")
  public void f(String firstname,String lastname,String phone,String date,String sex) {
	  driver.findElement(By.id("txtFirstName")).clear();
		driver.findElement(By.id("txtFirstName")).sendKeys(firstname);
		
		driver.findElement(By.id("txtLastName")).clear();
		driver.findElement(By.id("txtLastName")).sendKeys(lastname);
		
		driver.findElement(By.id("txtPhone")).clear();
		driver.findElement(By.id("txtPhone")).sendKeys(phone);
		
		Select dayy=new Select(driver.findElement(By.name("City")));
		dayy.deselectAll();
		dayy.selectByVisibleText(date);
		
		List<WebElement> gen= driver.findElements(By.name("gender"));
		
		for(WebElement g:gen) {
			if(g.equals(sex)) {
				g.click();
			}
			
		}
  }
  
  @AfterMethod
	public void setdown() {
		
	}
}
