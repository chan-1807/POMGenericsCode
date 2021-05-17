package demoNG;

import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Parameterized {
	 @Test
	  @Parameters({"USERNAME","PASSWORD"})
	  public void f1(String name, String Pass) {
		  System.out.println("f1NAME IS " +name);
		  System.out.println("f1CODE is "+Pass);
		  Assert.assertTrue(false);
	  }
  @Test
  //(dependsOnMethods="f1")
  @Parameters({"USER","PASSWORD"})
  public void f(@Optional("XXXX")String name, String Pass) {
	  System.out.println("fNAME IS " +name);
	  System.out.println("fCODE is "+Pass);
  }
}
