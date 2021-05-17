package dataDriven;

import java.sql.Driver;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import excel.utility.Xls_Reader;

public class exceldata {

	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chandru\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("C:\\Users\\Chandru\\Desktop\\Se CG Materials\\SeleniumDemos\\AdvancedSeleniumDemos\\AdvancedSeleniumDemos\\SeleniumWDAPIDemos\\src\\WorkingWithForms.html");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String path="C:\\Users\\Chandru\\eclipse-workspace\\TestNG\\EXCEL\\Book1.xlsx";
		Xls_Reader reader=new Xls_Reader(path);
		int rowcnt=reader.getRowCount("Sheet1");
		
		for(int row=2;row<=rowcnt;row++) {
		
			String firstname=reader.getCellData("Sheet1", "firstname", row);
			String lastname=reader.getCellData("Sheet1", "lastname", row);
			String phone=reader.getCellData("Sheet1", "phone", row);
			String date=reader.getCellData("Sheet1", "city", row);
			String sex=reader.getCellData("Sheet1", "sex", row);
			System.out.println("Out "+firstname+" " + lastname+" " +phone+" " +date+" "+sex); 
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
		//Thread.sleep(1000);
		}
		
		
		
		
	}

}
