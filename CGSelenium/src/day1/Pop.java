package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chandru\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.popuptest.com/popuptest12.html");
		
		driver.manage().window().maximize();
		
		String parent= driver.getWindowHandle();
		
		for(String child: driver.getWindowHandles()) {
			if (!child.equals(parent)) {
				driver.switchTo().window(child);
				driver.close();
			}
		}
		
		driver.switchTo().window(parent);
		
		driver.close();
		//driver.switchTo().window(arg0)
	}

}
