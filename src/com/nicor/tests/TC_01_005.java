package com.nicor.tests;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.nicor.generic.BaseTest;
import com.nicor.pages.NICORForHealthOrganisationsAndRegulators;
import com.nicor.pages.NicorHome;
public class TC_01_005 extends BaseTest
{
	String ForHealthOrganisationsAndRegulators="NICOR | For health organisations and regulators";
	@Test(groups = { "1st Module" })
	public void testresearchersPage()
	{
		log.info("***$$ Started TC_01_005  Test Researches page $$**");
	String title="NICOR";
	
	NicorHome home=new NicorHome(driver);
	
	NICORForHealthOrganisationsAndRegulators nfho=new NICORForHealthOrganisationsAndRegulators(driver);
	
	// to verify the home title
	home.verifyTheTitle(title);
	
	// to click on for organisations link
	home.clickOnOrganisationsLink();
	
	log.info("clicked organisations");

	
	//Reporter.log("clicked organisations",true);
	
	// to verify the title of health organisations page
	nfho.verifyTitle(ForHealthOrganisationsAndRegulators);
	
	}
	
}
