package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;

public class FuncTest extends BaseClass{
  @Test
  public void f() throws InterruptedException {
	  LoginPage login=PageFactory.initElements(driver, LoginPage.class);
	  login.passWmail("9965523623");
	  login.passpass("Selvam@63");
	 
	  login.submit();
	  Thread.sleep(800);
	  HomePage home=PageFactory.initElements(driver, HomePage.class);
	  Thread.sleep(1000);
	  home.searchfor("selvarajan");
	  Thread.sleep(800);
	  driver.navigate().back();
	  Thread.sleep(800);
	  home.logout();
  }
}
