package com.nicor.generic;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.internal.TestResult;

public abstract class BaseTest implements AutoConstant 
{	
	public static Logger log = Logger.getLogger("devpinoyLogger");
	public static WebDriver driver;
	@BeforeMethod
	public void precondition()
	{
		
		System.setProperty(chrome_key, chrome_value);
		System.setProperty(gecko_key, gecko_value);
		
		driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.nicor.org.uk/");
		
		log.info("Nicor Opened");
		//Reporter.log("nicor opened",true);
	}
	
	@AfterMethod
	public void postCondition()
	{
		
		driver.close();
		log.info("Nicor Closed Successfully");
		//Reporter.log("nicor closed",true);
		
	
		
	}

}
