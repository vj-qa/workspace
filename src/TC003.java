package Selenium;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC003 extends UtilClass {
	 private WebDriver driver;
		@BeforeClass
		public static void setUpBeforeClass() throws Exception {
			
		}

		@AfterClass
		public static void tearDownAfterClass() throws Exception {
		}

		@Before
		public void setUp() throws Exception {
			driver= new FirefoxDriver();
		}

		@After
		public void tearDown() throws Exception {
			driver.quit();
		}

		@Test
		public void test() throws InterruptedException, IOException {
			startReport("Login Test Case","C:\\Users\\vj\\Desktop\\Report\\");
			driver.get("https://login.salesforce.com/");
			Date date = new Date();
			String timestamp = date.getDate()+"."+date.getHours()+date.getMinutes();
			driver.findElement(By.id("username")).sendKeys("gopala.anumanchipalli@gmail.com");
			driver.findElement(By.id("Login")).click();
			Thread.sleep(5000);
			    String str =driver.findElement(By.id("error")).getText();
			    System.out.println(str);
			    if( str.equals("Please enter your password." )){
			    	System.out.println(str);
					Update_Report( "Pass", "Blank password error validation",  "Error message validated");
			    }else{
			    	System.out.println(str+" fail");
					Update_Report( "Fail", "Blank password error validation",  "Error message not as expected");
			    }
		}
		
		private boolean isElementPresent(By by) {
		    try {
		      driver.findElement(by);
		      return true;
		    } catch (NoSuchElementException e) {
		      return false;
		    }
		  }

	}
