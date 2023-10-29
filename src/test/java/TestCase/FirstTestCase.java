package TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Base.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTestCase extends BaseTest {

	@Test(dataProvider="testdata")
	public static void LogTest(String username, String password) throws InterruptedException {
		driver.findElement(By.linkText("Sign in")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("login_id")).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"nextbtn\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"nextbtn\"]")).click();

	}
	
	@DataProvider(name="testdata")
	public Object[][] tdata()
	{
		return new Object[][] {
			{"azmainanan1998@gmail.com","0174369097"},
			{"azmainanan199@gmail.com","01743690978"},
			{"azmainanan998@gmail.com","0174369098"},
			{"azmainanan1998@gmail.com","01743690978"}
		};
	   	
	}

}
