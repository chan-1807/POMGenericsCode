package demoNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class ANNOTATIONS {
	
	public static void main(String[] args) {
		ANNOTATIONS a=new ANNOTATIONS();
		a.display();
		
	}
	public void display() {
		System.out.println("TESTING WITHOUT ANNOTATION");
	}
	
  @Test
  public void f() {
	  System.out.println("MAIN TEST 1");
  }
  @Test
  public void f1() {
	  System.out.println("MAIN TEST 2");

  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("BEFORE METHOD");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("AFTER METHOD");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("BEFORE CLASS");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("AFTERCLASS");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("BEFORETEST");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("AFTERTEST");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("BEFORESUITE");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("AFTERSUITE");
  }

}
