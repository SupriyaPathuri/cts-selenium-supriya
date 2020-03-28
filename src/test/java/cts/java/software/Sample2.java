package cts.java.software;

import org.testng.Assert;
import org.testng.annotations.Test;
public class Sample2 {

@Test
public void TestA() {
Assert.assertEquals("google","google" );
}
@Test
public void TestB() {
Assert.assertEquals("yahoo1","yahoo" );
}
@Test
public void TestC() {
Assert.assertEquals("yahoo","yahoo" );
}	

}
