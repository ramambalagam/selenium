package listners;

import org.testng.ITestListener;
import org.testng.ITestResult;

//post actions
//create xml with test and listners itestlistner or extend itestlistneradaptor
public class Listners implements ITestListener {

	public void onTestStart(ITestResult result) {
		   System.out.println(" execution started");
		  }
	public void onTestSuccess(ITestResult result) {
	   System.out.println(" case is successfull");
	  }
}
