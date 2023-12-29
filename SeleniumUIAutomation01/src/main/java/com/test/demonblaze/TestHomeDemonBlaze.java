package com.test.demonblaze;

//import org.junit.After;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;
import com.test.demonblaze.*;


public class TestHomeDemonBlaze extends BaseHomeDemonBlaze{
	
	
	
	//public static WebDriver driver;
	public static String NewMessage = "//h5[@id='exampleModalLabel']";
	

	@Test
	public void test_001_navigate_to_contact() throws InterruptedException {
		try {
		WebElement contact_button = driver.findElement(By.xpath(home.CONTACT));
		contact_button.click();
		Thread.sleep(5000);
		WebElement contact_popup = driver.findElement(By.xpath(NewMessage));
		Thread.sleep(5000);
		AssertJUnit.assertEquals(contact_popup.getText(),"New message");
		Thread.sleep(5000);	
		test.log(LogStatus.PASS, "Test case pass");
		}
		catch(Exception e) {
			test.log(LogStatus.FAIL, e.getMessage());
		}
		
	}
	
	@Test
	public void test_002_navigate_to_AboutUs() throws InterruptedException {		
		
		try {
			WebElement abt_button = driver.findElement(By.xpath(home.ABOUTUS));
			abt_button.click();
			Thread.sleep(5000);
			WebElement abt_popup = driver.findElement(By.id("videoModalLabel"));
			Thread.sleep(5000);
			AssertJUnit.assertEquals(abt_popup.getText(),"About us");
			Thread.sleep(5000);	
			test.log(LogStatus.PASS, "Test case pass");
		} catch(Exception e) {
			test.log(LogStatus.FAIL, e.getMessage());
		}
		
		
		
	}
	
}

	
