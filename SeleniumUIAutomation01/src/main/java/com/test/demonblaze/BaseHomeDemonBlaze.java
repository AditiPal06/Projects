package com.test.demonblaze;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;


import com.page.demonblaze.HomePage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseHomeDemonBlaze {
	
	public static WebDriver driver;
	public static ExtentReports report;
	public static ExtentTest test;
	
	
	HomePage home = new HomePage(driver);
	
	@BeforeClass
	public void setup() {
		report = new ExtentReports(System.getProperty("user.dir")+"/Reports/ExtentReportResults.html");
		
		
	}
	
	@BeforeMethod
	public void onTest() throws InterruptedException {
		test = report.startTest("DemoblazeTest");
		driver = WebDriverInitialize("chrome");
		Thread.sleep(5000);
		driver.navigate().to("https://www.demoblaze.com/");
		driver.manage().window().maximize();

		Thread.sleep(5000);
	}
	
	@AfterMethod	
	public void ExitChrome() {
		driver.quit();
	}
	
	@AfterClass
	public static void endTest()
	{
	report.endTest(test);
	report.flush();
	}
	
	
	public static WebDriver WebDriverInitialize(String d) {
		
		if(d.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			System.out.println("driver initialized");
		}
		else if(d.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			System.out.println("driver initialized");
		}
		else if(d.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			System.out.println("driver initialized");
		}
		
		
		return driver;
		
	}
	
//	public void captureScreenshot(String filename) {
//		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
//		File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
//		
//		File destFile = new File("./Screenshots/img1.jpg");
//		FileUtils.copyFile(sourceFile, destFile);
//		System.out.println("Screenshot saved successfully");
//	}
		

}
