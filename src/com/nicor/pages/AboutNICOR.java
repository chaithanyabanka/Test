package com.nicor.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.nicor.generic.BasePage;

public class AboutNICOR extends BasePage
{
	public AboutNICOR(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}

}
