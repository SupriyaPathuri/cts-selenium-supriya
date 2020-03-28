package cts.java.software;

import org.testng.annotations.Test;
public class Parallel2 {
	@Test
	public void testcase4() {
	long id4=Thread.currentThread().getId();
	System.out.println("testcase4"+"-------->"+ id4);
	}
	@Test
	public void testcase5() {
	long id5=Thread.currentThread().getId();
	System.out.println("testcase5"+"------->"+ id5);
	}
	@Test
	public void testcase6() {
	long id6=Thread.currentThread().getId();
	System.out.println("testcase6"+"------>"+ id6);
	}
}
