package day1;

import org.openqa.selenium.edge.EdgeDriver;

import utilities.ReadingPropertyFile;

import java.io.IOException;

import org.openqa.selenium.WebDriver;


public class FirstTestCase  {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new EdgeDriver();// any driver can be saved in web driver
		driver.get(ReadingPropertyFile.propertyval().getProperty("url"));
		String var = driver.getTitle();

		if(var.equals("Google"))
		{
			System.out.println("test passed");

		}
		else
		{
			System.out.println("test failed");
		}

		driver.quit();
	}

}
