package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiBrowserTest {
	WebDriver driver;
	
	@Parameters("browser")
	@BeforeTest
  public void f(String brow) {
		if(brow.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chandru\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
			 driver= new ChromeDriver();
			
		}
		else if(brow.equalsIgnoreCase("ie")) {
			//System.getProperty("webdriver.ie.driver", "C:\\Users\\Chandru\\Downloads\\JARS\\IEDriverServer.exe");
			System.setProperty("webdriver.ie.driver", "C:\\Users\\Chandru\\Downloads\\JARS\\IEDriverServer.exe");
			 driver=new InternetExplorerDriver();
			
		}
		else {
			System.out.println("BROWSER NOT SPECIFIED");
		}
  }
	@Test
	public void navigate() {
		driver.get("https://demo.opencart.com/");
	}
	
	@AfterTest
	public void close() {
		driver.close();
	}
	
}
