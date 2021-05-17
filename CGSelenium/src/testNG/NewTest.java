package testNG;

import org.testng.annotations.Test;

public class NewTest {
  @Test(groups= {"car"})
  public void f() {
	  System.out.println("CAR");
  }
  @Test(groups= {"car","carmod"})
  public void f1() {
	  System.out.println("MARUTHI");
  }
  @Test(groups= {"bike"})
  public void f2() {
	  System.out.println("BIKE");
  }
  @Test(groups= {"bike","scooter"})
  public void f3() {
	  System.out.println("SCOOTER");
  }
}
