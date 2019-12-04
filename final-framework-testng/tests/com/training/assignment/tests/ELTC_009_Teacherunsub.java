package com.training.assignment.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.ELTC_007POM;
import com.training.pom.ELTC_008POM;
import com.training.pom.ELTC_009POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ELTC_009_Teacherunsub {
  
  private WebDriver driver;
	private String baseUrl;
	private ELTC_007POM ELTC_007POM ;
	private ELTC_008POM ELTC_008POM ;
	private ELTC_009POM ELTC_009POM ;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		ELTC_007POM = new ELTC_007POM(driver); 
		ELTC_008POM = new ELTC_008POM(driver); 
		ELTC_009POM = new ELTC_009POM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	
	@Test
	public void validLoginTest() throws InterruptedException {
		ELTC_007POM.sendUserName("admin");
		ELTC_007POM.sendPassword("admin@123");
		ELTC_007POM.clickLoginBtn(); 
		//screenShot.captureScreenShot("First");
		
		ELTC_007POM.clickmycourses();
		Thread.sleep(5000);
		ELTC_009POM.clickcoursename();
		Thread.sleep(5000);
		ELTC_009POM.User();
		ELTC_009POM.Checkbox();
		ELTC_009POM.Unsub();
		}
}

