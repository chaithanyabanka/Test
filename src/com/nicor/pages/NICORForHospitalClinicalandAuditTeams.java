package com.nicor.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.nicor.generic.BasePage;

public class NICORForHospitalClinicalandAuditTeams extends BasePage
{
	
	public NICORForHospitalClinicalandAuditTeams(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

}


