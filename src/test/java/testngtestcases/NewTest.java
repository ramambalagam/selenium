package testngtestcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;
	@Test(priority =1)
	void openapp() {
		driver = new ChromeDriver();
		driver.get("https://google.com");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

	}
	@Test(priority=2)
	void testlogo() {

	boolean searchbutton = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).isDisplayed();
		System.out.println("button available "+searchbutton);
	
System.out.println();
	}
	@Test(priority=3)
	void login(){
System.out.println("login success");
	}

	@Test(priority=4)
	void close() {
		driver.close();

	}
}
