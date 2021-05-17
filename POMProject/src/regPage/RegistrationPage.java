package regPage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {
	WebDriver driver;
	By UserName =By.id("txtUserName");
	By Password = By.name("txtPwd");
	By ConfirmPassword = By.id("txtConfPassword");
	By FirstName = By.name("txtFN");
	By LastName = By.id("txtLastName");
	By Gender = By.name("gender");
	By City = By.name("City");
	By Submit = By.name("submit");
	
	public RegistrationPage(WebDriver driver) {
		this.driver=driver;
	}
	public void passUserName(String uname) {
		driver.findElement(UserName).sendKeys(uname);
	}
	public void passPassword(String uname) {
		driver.findElement(Password).sendKeys(uname);
	}
	public void passCPassword(String uname) {
		driver.findElement(ConfirmPassword).sendKeys(uname);
	}
	public void passFirstName(String uname) {
		driver.findElement(FirstName).sendKeys(uname);
	}
	public void passLastName(String uname) {
		driver.findElement(LastName).sendKeys(uname);
	}
	
	public void passGender(String gen) {
		List<WebElement> gend= driver.findElements(Gender);
		
		for(WebElement g:gend) {
			String radio;
			radio=g.getAttribute("value").toString();
			if(radio.equals(gen)) {
				g.click();
			}
		}
	}
	
	public void passcity(int ci) {
		Select c=new Select(driver.findElement(City));
		c.selectByIndex(ci);
	}
	public void submit() {
		driver.findElement(Submit).click();
	}
	public String pagetitle() {
		return driver.getTitle();
	}
	public void Website(String strUName,String strPwd,String strCPwd,String strFName,String strLName,String strGender,int strCityName) {
		passUserName(strUName);
		passPassword(strPwd);
		passCPassword(strCPwd);
		passFirstName(strFName);
		passLastName(strLName);
		passGender(strGender);
		passcity(strCityName);
	}
}
