package Org.qsp.testNGDemo;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(demo4.class)
public class demo5 {
	@Test
	public void m1()
	{
		Reporter.log("Hi..1",true);
	}
	@Test
	public void m2()
	{
		Reporter.log("Hi..2",true);
		Assert.fail();
	}
}
