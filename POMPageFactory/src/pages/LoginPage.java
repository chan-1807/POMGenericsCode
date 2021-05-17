package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	WebDriver driver;
	
	@FindBy(id="email") WebElement email;
	@FindBy(how=How.ID,using="pass")WebElement password;
	@FindBy(id="u_0_b") WebElement submit;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void passWmail(String ema) {
		email.sendKeys(ema);
	}
	public void passpass(String pa) {
		password.sendKeys(pa);
	}
	public void submit() {
		submit.click();
	}


	
	
}
