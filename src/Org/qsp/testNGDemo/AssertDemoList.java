package Org.qsp.testNGDemo;

import java.util.List;
import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertDemoList {
	@Test
	public void m1()
	{		
		String aName="Samyak"; 
		String eName="Samyak";
		Assert.assertEquals(aName, eName);
		System.out.println("Matched");
		
		List<String> lst1=new ArrayList<String>();
		lst1.add("abc");
		lst1.add("pqr");
		lst1.add("xyz");
		lst1.add("mno");
		
		List<String> lst2=new ArrayList<String>();
		lst2.add("abc");
		lst2.add("pqr");
		lst2.add("xyz");
		lst2.add("mno");
		
		Assert.assertEquals(lst1, lst2);
		System.out.println("Matched List");
		
	}

}
