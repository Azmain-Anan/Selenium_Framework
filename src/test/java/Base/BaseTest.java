package Base;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public static WebDriver driver;
	Properties pro = new Properties();
	public static FileReader fr;
	
	
	@BeforeTest
	public void setup() throws IOException {
		if(driver==null) {
			FileReader fr = new FileReader("C:\\Users\\Asus\\eclipse-workspace\\Frame\\src\\test\\resources\\ConfigFiles\\config.properties");
			pro.load(fr);
		}
		
		if(pro.getProperty("browser").equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get(pro.getProperty("testUrl"));
			driver.manage().window().maximize();
		}
		else if(pro.getProperty("browser").equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.get(pro.getProperty("testUrl"));
			driver.manage().window().maximize();
		}
		else if(pro.getProperty("browser").equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.get(pro.getProperty("testUrl"));
			driver.manage().window().maximize();
		}
		
	}
	
	@AfterTest
	public void teardown() {
		driver.close();
		System.out.println("Teardown Successful");
		
	}

}
