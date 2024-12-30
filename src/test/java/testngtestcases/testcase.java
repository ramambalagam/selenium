package testngtestcases;

import org.testng.annotations.Test;

public class testcase extends annotatiosn {
	
	@Test(priority =1)
	void loing()
	{
		System.out.println("opening url");
	}
@Test(priority = 3)
	void doactions()
	{
		System.out.println("do actions");
	
	}
	
	void logout()
	{
		System.out.println("logout");
	}
}
