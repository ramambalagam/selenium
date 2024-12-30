package testngtestcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class annotatiosn {

	@BeforeSuite
	void beforesuite() {
		System.out.println("beforeSuite");
	}

	@AfterSuite
	void aftersuite() {
		System.out.println("aftersuite");

	}
	
	@BeforeTest
	void beforetest() {
		System.out.println("beforetest");
	}
@AfterTest
	void aftertest() {
		System.out.println("aftertest");
	}
	@BeforeMethod
	void beforemethod(){
		System.out.println("beofremethod");
	}

	@AfterMethod
	void aftermethod() {
		System.out.println("aftermethod");
	}
	
	@Test
	void testcase1() {
		System.out.println("testcase1");
	}
	@Test
	void testcase2() {
		System.out.println("test case 2");
	}
}
