package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {


	public static WebDriver driver = null;
	
	public static WebDriver getDriver(BrowserType browserType) {
		switch (browserType) {
		
		case CHROME:
			System.out.println("Instantiate Chrome Driver");
			driver  = new ChromeDriver();
			return driver;

		case FIREFOX:
			System.out.println("Instantiate FireFox Driver");
			driver = new FirefoxDriver();
			return driver;

		default:
			throw new IllegalArgumentException("Unsupported BrowserType " + browserType);
		}
		
	}
	
}
