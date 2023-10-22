package TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Base.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTestCase extends BaseTest {

	@Test
	public static void LogTest() throws InterruptedException {
		driver.findElement(By.linkText("Sign in")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("login_id")).sendKeys("azmainanan1998@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"nextbtn\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("01743690978");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"nextbtn\"]")).click();

	}

}
