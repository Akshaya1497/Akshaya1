package Org.qsp.testNGDemo;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class demo1 {
	
    @BeforeMethod
    public void BM()
    {
    	Reporter.log("BM..",true);
    }	
    @Test(invocationCount=5)
	public void m1()
	{
		Reporter.log("Hiii..",true);
	}
	 @AfterMethod
	    public void AM()
	    {
	    	Reporter.log("AM..",true);
	    }
}
