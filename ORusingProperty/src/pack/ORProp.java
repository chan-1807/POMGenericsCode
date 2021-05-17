package pack;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ORProp {

	public static void main(String[] args) throws IOException {
		File file;
		FileInputStream fis;
		
		file=new File("./Configuration/config.property");
		fis=new FileInputStream(file);
		
		Properties prop;
		prop=new Properties();
		prop.load(fis);
		
		System.setProperty("webdriver.chrome.driver", prop.getProperty("ChromePath"));
		
		WebDriver driver=new ChromeDriver();
		
		driver.get(prop.getProperty("APP"));
		
		driver.findElement(By.id(prop.getProperty("UserName"))).sendKeys("CHAN");
		driver.findElement(By.id(prop.getProperty("PassWord"))).sendKeys("pass");
		driver.findElement(By.id(prop.getProperty("Confirm"))).sendKeys("pass");

	}

}
