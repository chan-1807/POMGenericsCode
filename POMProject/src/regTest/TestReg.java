package regTest;

import org.testng.annotations.Test;

import regPage.RegistrationPage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;

public class TestReg {
	WebDriver driver;
	RegistrationPage page;
	
	String chdriverpath="C:\\Users\\Chandru\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe";
	String iedriverpath="C:\\Users\\Chandru\\Downloads\\JARS\\IEDriverServer.exe";
  @Test
  public void f() {
	  page=new RegistrationPage(driver);
	  String pagetitle=page.pagetitle();
	  System.out.println(pagetitle);
	  page.Website("Shilpa","CG@123","CG@123","Shilpa","Bhosle","Female",1);
  }
  @Parameters("browser")
  @BeforeTest
  public void beforeTest(String b) {
	  if(b.equalsIgnoreCase("chrome")) {
		  System.setProperty("webdriver.chrome.driver", chdriverpath);
		  driver=new ChromeDriver();
	  }
	  else if (b.equalsIgnoreCase("ie")) {
		  System.setProperty("webdriver.ie.driver", iedriverpath);
			 driver=new InternetExplorerDriver();
	  }
	  
	  driver.get("C:\\Users\\Chandru\\Desktop\\SeleniumDemos\\Selenium Day 5 Demos\\Lesson08POMClsDemos\\src\\POMSampleForm.html");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() throws InterruptedException {
	  Thread.sleep(1000);
	  driver.close();
  }

}
