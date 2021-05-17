package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {
	WebDriver driver;
	
	@FindBy(how=How.CLASS_NAME,using="_1frb") WebElement searchbox;
	@FindBy(how=How.CLASS_NAME,using="_42ft _4jy0 _4w98 _4jy3 _517h _51sy _4w97") WebElement search;
	@FindBy(how=How.ID,using="userNavigationLabel") WebElement sett;
	@FindBy(how=How.ID,using="u_10_3") WebElement logout;
	
	public void searchfor(String name) {
		searchbox.sendKeys(name);
		search.click();
	}
	
	public void logout() {
		sett.click();
		logout.click();
	}
}
