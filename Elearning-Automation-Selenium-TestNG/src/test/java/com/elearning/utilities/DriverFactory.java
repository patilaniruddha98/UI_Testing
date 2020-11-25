package com.elearning.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


/**
 * 
 * @author Naveen
 * @see This class will load the given driver, and follows factory pattern 
 * 	@since 16-Dec-2018 
 */
public class DriverFactory {
	// it only a reference 
	protected static WebDriver driver; 
	protected static ReadConfig readconfig = new ReadConfig();
	
	public static WebDriver getDriver(String driverName){
		
		if(driverName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", readconfig.getChromeDriver());
			driver = new ChromeDriver();
		
			
		}else if (driverName.equals("firefox")) {
			System.setProperty("webdriver.firefox.driver", readconfig.getFirefoxDriver());
			driver = new FirefoxDriver();
		} else if (driverName.equals("ie")) {
			System.setProperty("webdriver.ie.driver", readconfig.getIEDriver());
			driver = new InternetExplorerDriver();

		}
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}
}