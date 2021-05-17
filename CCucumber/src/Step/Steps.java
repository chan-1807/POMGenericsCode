package Step;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Steps {
	//
	WebDriver driver;
	
	@Given("^Open Browser and Navigate to FB$")
	public void open_Browser_and_Navigate_to_FB() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chandru\\Documents\\Jars\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.navigate().to("https://www.phptravels.net/login");
	   
	}

@When("^Entering Credentials \"([^\"]*)\" and \"([^\"]*)\"$")
public void entering_Credentials_and(String arg1, String arg2) throws Throwable {
    driver.findElement(By.xpath("//*[@id=\"loginfrm\"]/div[3]/div[1]/label/input")).sendKeys(arg1);
    driver.findElement(By.xpath("//*[@id=\"loginfrm\"]/div[3]/div[2]/label/input")).sendKeys(arg2);
}

@When("^Clicking on login button$")
public void clicking_on_login_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.xpath("//*[@id=\"loginfrm\"]/button")).click();
}

@Then("^It should login to FB$")
public void it_should_login_to_FB() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    
    driver.manage().window().maximize();
}

	

}
