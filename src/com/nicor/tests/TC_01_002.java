package com.nicor.tests;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.nicor.generic.BaseTest;
import com.nicor.pages.NICORForHospitalClinicalandAuditTeams;
import com.nicor.pages.NicorHome;

public class TC_01_002 extends BaseTest
{
	String ForHospitalstitle="NICOR | For hospital clinical and audit teams";
	@Test(groups = { "1st Module" })
	public void testHospitalsPage()
	{
		log.info("***$$ Started TC_01_003  Test Hospitals page $$**");
		
	String title="NICOR";
	
	NicorHome home=new NicorHome(driver);
	
	NICORForHospitalClinicalandAuditTeams hcat=new NICORForHospitalClinicalandAuditTeams(driver);
	
	// to verify the title
	home.verifyTheTitle(title);
	
	
	home.clickOnhospitalsLink();
	log.info("clicked hosp");

	//Reporter.log("clicked hosp",true);
	
	
	hcat.verifyTitle(ForHospitalstitle);
	

	
	
	
	
	}
	

}
