package cts.java.software;

import org.testng.annotations.Test;
class Parallel1 {
	@Test
	public void testcase1() {
	long id1=Thread.currentThread().getId();
	System.out.println("testcase1"+"->"+ id1);
	}
	@Test
	public void testcase2() {
	long id2=Thread.currentThread().getId();
	System.out.println("testcase2"+"->"+ id2);
	}
	@Test
	public void testcase3() {
	long id3=Thread.currentThread().getId();
	System.out.println("testcase3"+"->"+ id3);
	}
}
