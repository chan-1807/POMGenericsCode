package grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestOne {
public static void main(String[] args) throws MalformedURLException, InterruptedException {
	WebDriver driver = new RemoteWebDriver(new URL("http://172.20.10.2:4444/wd/hub"), DesiredCapabilities.edge());
	driver.get("http://demo.opencart.com/");
	Thread.sleep(1000);
	driver.close();
	}
}
