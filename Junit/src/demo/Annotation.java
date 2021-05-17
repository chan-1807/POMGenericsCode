package demo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Annotation {
	static int a=10;
@BeforeClass



public static void beforeclass() {
	System.out.println("BEFORECLASSS");
	System.out.println(a);
}
@AfterClass
public static void afterclass() {
	a=1000;
	System.out.println("AFTERCLASS");
	System.out.println(a);
}
@Before
public void before() {
	a=100;
	System.out.println("BEFORE");
	System.out.println(a);
}
@After
public void after() {
	a=100000;
	System.out.println("AFTER");
	System.out.println(a);
}
@Test
public void atest() {
	a+=10;
	System.out.println("TEST A");
	System.out.println(a);
}
@Test
public void btest() {
	a-=10;
	System.out.println("TEST B");
	System.out.println(a);
}

}
