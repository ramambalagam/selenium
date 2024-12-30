package testngtestcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assertions {
	@Test
	void testcase() {
//		String exp ="test1";
//		String act="test";
		System.out.println("start");
		Assert.assertTrue(true);
		System.out.println("end");
		;
	}
	
	@Test(dependsOnMethods = {"testcase"})
	void depends() {
		System.out.println("previosu case pass");
	}
	
	//grouping

}
