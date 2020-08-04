package Org.qsp.testNGDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertDemo {
	@Test
	public void m1()
	{
		String aName="Samyak"; 
		String eName="Samyak";
		Assert.assertEquals(aName, eName);
		System.out.println("Matched");
	}

}
