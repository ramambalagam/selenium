package parameter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class dataprovider {
	
	WebDriver driver;
	
	@BeforeClass
	@Parameters({"browser"})
	void setup(String br) {
		
		switch(br.toLowerCase()) {
		
			
			case "chrome": System.out.println("initiate chrome driver");
			driver = new ChromeDriver();
			break;
			case "edge": System.out.println("intinate edge driver");
			driver = new EdgeDriver();
			break;
			default: System.out.println("invalid browser"); return;
		}
		System.out.println("opening login page");
		
	}
	
	@Test(dataProvider ="np")
	void login(String username,String password) {
	
	System.out.println("username "+username);	
	System.out.println("password "+password);
	}
	@AfterClass
	void teardown() {
		
		System.out.println("logout");
		
		
		 
	}
	//data type of data provides is Object type
	
	
	@DataProvider(name="np", indices= {0})
	Object[][] logindata()
	{
		
		Object data [][]= {
			{"ramam","password"},{"satya","password"}
			
		};
		
		return data;
		
	}

}
	