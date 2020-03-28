package cts.java.software;

import org.testng.annotations.Test;


public class Display {
	@Test(groups= {"vendor"})
	public void vendor1() {
	System.out.println("vendor1");
	}
	@Test(groups= {"vendor"})
	public void vendor2() {
	System.out.println("vendor2");
	}
	@Test(groups= {"vendor"})
	public void vendor3() {
	System.out.println("vendor3");
	}
	@Test(groups= {"customer"})
	public void customer1() {
	System.out.println("customer1");
	}
	@Test(groups= {"customer"})
	public void customer2() {
	System.out.println("customer2");
	}
	@Test(groups= {"customer"})
	public void customer3() {
	System.out.println("customer3");
	}
	@Test(groups= {"vendor","customer"})
	public void admin1() {
	System.out.println("admin1");
	}
	@Test(groups= {"vendor","customer"})
	public void admin2() {
	System.out.println("admin2");
	}
}
