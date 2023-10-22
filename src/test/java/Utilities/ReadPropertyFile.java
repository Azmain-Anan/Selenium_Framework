package Utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("C:\\Users\\Asus\\eclipse-workspace\\Frame\\src\\test\\resources\\ConfigFiles\\config.properties");
		
		Properties pr = new Properties();
		
		pr.load(fr);
		
		System.out.println(pr.getProperty("browser"));
		System.out.println(pr.getProperty("testUrl"));
	}

}
