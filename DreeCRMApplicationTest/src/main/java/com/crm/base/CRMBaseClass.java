package com.crm.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CRMBaseClass {
	public static WebDriver driver;
	public static Properties prop;
	
	public CRMBaseClass() {
		prop=new Properties();
		FileInputStream fis = null;
		try {
			 fis=new FileInputStream("C:\\Users\\Chandru\\eclipse-workspace\\DreeCRMApplicationTest\\properties\\config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void initialisation() {
		String Brow= prop.getProperty("browser");
		if (Brow.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chandru\\Downloads\\CHromeDriver new\\chromedriver.exe");
			driver=new ChromeDriver();
		}else if(Brow.equals("ff")) {
			System.setProperty("webdriver.gecko.driver", "");
		}
		else
			System.out.println("Specify any browser");
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
	}
	
}
