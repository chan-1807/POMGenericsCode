package demo;

import org.junit.Ignore;
import org.junit.Test;

import junit.framework.Assert;

public class Assertion {
@SuppressWarnings("deprecation")
@Ignore
@Test
public void atest() {
	Assert.assertTrue(false);
	Assert.assertFalse(false);
}
@Test
public void test() {
	System.out.println();
	Assert.assertFalse(false);
	Assert.assertFalse(false);
}
@Test
public void btest() {
	System.out.println();
	Assert.assertFalse(false);
	Assert.assertFalse(false);
}
@Test
public void test1() {
	System.out.println("hello");
	Assert.assertFalse(false);
	Assert.assertFalse(true);
}

}
