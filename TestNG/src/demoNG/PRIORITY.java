package demoNG;

import org.testng.annotations.Test;

public class PRIORITY {
  @Test(priority=7,enabled=false)
  public void CHAN() {
	  System.out.println("CHAN 7");
  }
  @Test(priority=3)
  public void TEJA() {
	 System.out.println("TEJA 3");
  }
  @Test(invocationCount=10)
  public void AELVA() {
	  System.out.println("SELVA 1");
  }
}
