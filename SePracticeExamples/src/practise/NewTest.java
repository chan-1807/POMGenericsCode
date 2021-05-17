package practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chandru\\Downloads\\Jar-Files\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/Chandru/Desktop/WorkingWithForms.html");
		
		Select ac=new Select(driver.findElement(By.name("City")));
		
		Select sorted=new Select(driver.findElement(By.name("City1")));
	//	System.out.println(ac.getOptions());
		
		List<WebElement> aa= ac.getOptions();
		List<WebElement> ss= sorted.getOptions();
		
		List actualList=new ArrayList();
		
		List sortedList=new ArrayList();
		for(WebElement a:aa) {
			String aaa=a.getAttribute("value");
			//System.out.println(aaa);
			actualList.add(aaa);
		}
		for(WebElement aaa:ss) {
			String so=aaa.getAttribute("value");
			//System.out.println(aaa);
			sortedList.add(so);
		}
		System.out.println(actualList);
		List temp= new ArrayList();
		
		temp.addAll(actualList);
		
		Collections.sort(temp);
		
		System.out.println(temp);
		
		Assert.assertTrue(actualList.equals(temp));
	//	Assert.assertTrue(sortedList.equals(temp));
		
		
		
		
		
  }
}
