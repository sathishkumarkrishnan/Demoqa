package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import utils.BrowserType;
import utils.DriverManager;

public class BaseTest {

	
	protected static WebDriver driver;
	
	@BeforeClass
	protected static void setupDriver() {
	    if (driver == null) {
	        System.out.println("Passing Browser Type");
	        driver = DriverManager.getDriver(BrowserType.CHROME);
	    }
	}
	
	protected void navigateToURL(String url)
	{
		System.out.println("Launching Application");
		getDriver().get(url);
	}
	
    public static WebDriver getDriver() {
        if (driver == null) {
        	setupDriver();
        }
        return driver;
    }
	@AfterClass
	protected void closeDriver()
	{
		if(driver!=null)
		{
			System.out.println("Quiting Driver");
			driver.quit();
			driver=null;
		}
	}
}
