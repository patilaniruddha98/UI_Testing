package com.elearning.testCases;

import java.io.File;

import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.elearning.pageObjects.LoginPage;
import com.elearning.testSteps.TS_OnPage_002;
import com.elearning.testSteps.TS_OnPage_003;
import com.elearning.testSteps.TS_OnPage_004;
import com.elearning.testSteps.TS_OnPage_005;
import com.elearning.testSteps.TS_OnPage_006;
import com.elearning.testSteps.TS_OnPage_007;
import com.elearning.testSteps.TS_OnPage_008;
import com.elearning.testSteps.TS_OnPage_009;
import com.elearning.testSteps.TS_OnPage_010;
import com.elearning.testSteps.TS_OnPage_011;
import com.elearning.testSteps.TS_OnPage_012;
import com.elearning.testSteps.TS_OnPage_013;
import com.elearning.testSteps.TS_OnPage_014;
import com.elearning.testSteps.TS_OnPage_015;
import com.elearning.utilities.DriverFactory;

public class BaseClass extends DriverFactory {

	public String baseURL = readconfig.getURL();

	public static Logger logger;

	@BeforeClass
	public void setUp() throws InterruptedException {

		logger = Logger.getLogger("elearning");
		PropertyConfigurator.configure("log4j.properties");

		DriverFactory.getDriver("chrome");

		driver.get(baseURL);
		logger.info("URL is opened");

	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

	public void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}

	@Test(priority = 0, dataProvider = "LoginData", dataProviderClass = com.elearning.DataProviders.LoginDataProviders.class)
	public void loginTest(String username, String password) throws Exception {

		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("username is entered");
		lp.setPassword(password);
		logger.info("password is entered");
		lp.clickLogin();
		logger.info("clicked on login button");

		boolean msg = driver.getPageSource().contains("Login failed - incorrect login or password.");
		if (msg == true) {
			logger.info("Login test failed");
			captureScreen(driver, "TC_LoginTest_001");
			Assert.assertTrue(false);
		} else {
			logger.info("Login test passed");
		}

	}

	@Test(priority = 1)
	public void ELTC_031() throws InterruptedException {

		String title1 = driver.getTitle();
		if (title1.equals("e Learning - My education - Create a course")) {
			Assert.assertTrue(true);
			logger.info(title1);
		}

		TS_OnPage_002.administrationPage();

		TS_OnPage_003.createCoursePage();

		TS_OnPage_004.myCoursesPage();

		TS_OnPage_005.selectedCoursePage();

		TS_OnPage_006.DescriptionPage_FirstArrival();

		TS_OnPage_007.ObjectivePage();

		TS_OnPage_006.DescriptionPage_SecondArrival();

		TS_OnPage_008.topicPage();
		
		TS_OnPage_006.DescriptionPage_ThirdArrival();

	}
	
	@Test(priority=2)
	public void ELTC_032(){
		
		TS_OnPage_005.selectedCoursePage_SecondArrival();
		
		TS_OnPage_009.testPage();
		
		TS_OnPage_010.testManagmentPage();
		
		TS_OnPage_011.OnlineQuizePage_FirstArrival();
		
		TS_OnPage_012.questionAnswerManagementPage();
		
		TS_OnPage_011.OnlineQuizePage_SecondArrival();
		
		TS_OnPage_009.testPage_SecondArrival();
		
		
	}
	
	@Test(priority=3)
	public void ELTC_033() {
		
		TS_OnPage_005.selectedCoursePage_ThirdArrival();
		
		TS_OnPage_013.assesmentPage();
		
		TS_OnPage_014.AddOnlineActivity();
		
		TS_OnPage_013.assesmentPage_SecondArrival();
		
		TS_OnPage_015.editLinkPage();
		
		TS_OnPage_013.assesmentPage_ThirdArrival();
		
		
		
		
	}

}
