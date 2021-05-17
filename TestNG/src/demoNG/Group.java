package demoNG;

import org.testng.annotations.Test;

public class Group {
  
  @Test
  public void f() {
	  System.out.println("Fun 0:" + Thread.currentThread().getId());
  }
  @Test(groups="grp1")
  public void f1() {
	  System.out.println("Fun 1:" + Thread.currentThread().getId());
  }
  @Test(groups= {"car"})
  public void f2() {
	  System.out.println("Fun 2:" + Thread.currentThread().getId());
  }
 
  @Test(groups="grp1")
 
  public void f3() {
	  System.out.println("Fun 3:" + Thread.currentThread().getId());
  }
  @Test(groups= {"car","tata"})
  public void f4() {
	  System.out.println("Fun 4:" + Thread.currentThread().getId());
  }
}
