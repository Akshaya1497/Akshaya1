package Org.qsp.testNGDemo;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class demo3 {
	
    @Test(dependsOnMethods="m2")
	public void m1()
	{
		Reporter.log("Hiii..1",true);
	}
     @Test()
 	public void m2()
 	{
 		Reporter.log("Hiii..2",true);
 		Assert.fail();
 		System.out.print("Akshaya");
 	}
     @Test()
 	public void m3()
 	{
 		Reporter.log("Hiii..3",true);
 	}
}
