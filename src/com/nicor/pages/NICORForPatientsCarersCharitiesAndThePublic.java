package com.nicor.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.nicor.generic.BasePage;

public class NICORForPatientsCarersCharitiesAndThePublic extends BasePage
{
	
	public NICORForPatientsCarersCharitiesAndThePublic(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void verifyTheElement(WebElement element)
	{
		verifyElement(element);
	}
}


