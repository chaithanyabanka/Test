package com.nicor.tests;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.nicor.generic.BaseTest;
import com.nicor.pages.NICORForPatientsCarersCharitiesAndThePublic;
import com.nicor.pages.NICORNationalCardiacAuditProgramme;
import com.nicor.pages.NicorHome;

public class TC_01_007 extends BaseTest
{
	String nationalCardiacAuditProgramme="NICOR | National Cardiac Audit Programme";
	@Test(groups = { "1st Module" })
	public void testresearchersPage()
	{
		
	String title="NICOR";
	
	NicorHome home=new NicorHome(driver);
	
	NICORNationalCardiacAuditProgramme ncap=new NICORNationalCardiacAuditProgramme(driver);
	
	// to verify the title
	home.verifyTheTitle(title);
	
	
	home.clickOnauditProgrammelink();
	log.info("clicked audit programme");

	//Reporter.log("clicked audit programme",true);
	
	
	// to verify the title of audit programme
	ncap.verifyTitle(nationalCardiacAuditProgramme);
	}

}
