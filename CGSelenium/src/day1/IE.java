package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver", "C:\\Users\\Chandru\\Downloads\\IEDriverServer_Win32_3.150.1\\IEDriverServer.exe");
		
		WebDriver driver=new InternetExplorerDriver();
		
		driver.get("https://www.google.co.in/#spf=1591195817474");
	}

}
