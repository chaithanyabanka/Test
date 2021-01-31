package com.nicor.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.nicor.generic.BasePage;

public class NICORForHealthOrganisationsAndRegulators extends BasePage
{
	
	public NICORForHealthOrganisationsAndRegulators(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void verifyTheElement(WebElement element)
	{
		verifyElement(element);
	}
}


