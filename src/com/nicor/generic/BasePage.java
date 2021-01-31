package com.nicor.generic;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class BasePage 
{
	public  WebDriver driver;
	
	public static Logger log = Logger.getLogger("devpinoyLogger");

	public  BasePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//to verify the title
	public void verifyTitle(String eTitle)
	{
		WebDriverWait wait=new WebDriverWait(driver,10);
		try
		{
			wait.until(ExpectedConditions.titleIs(eTitle));
			log.info("Title is matching :"+eTitle);
			//Reporter.log("Title is matching :"+eTitle,true);
			
		}
		catch(Exception e)
		{
			log.fatal("Title is not matching : Actual title is :"+driver.getTitle());
			//Reporter.log("Title is not matching : Actual title is :"+driver.getTitle(),true);
			Assert.fail();
		}
	}
	
	//to verify the element
	public void verifyElement(WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver,10);
		try
		{
			wait.until(ExpectedConditions.visibilityOf(element));
			log.info("Element is present :"+ element.getText());
			//Reporter.log("Element is present :",true);
			
		}
		catch(Exception e)
		{
			log.info("Element is NOT present :"+ element.getText());
			//Reporter.log("Element is not present :",true);
			Assert.fail();
		
		}
	}
	
	// to perform actions class for click on element
	
	public void clickOnElement(WebElement target)
	{
		Actions act = new Actions(driver);
		
		act.moveToElement(target).click();
	}

}
