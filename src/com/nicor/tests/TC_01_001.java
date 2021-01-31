package com.nicor.tests;

import org.apache.log4j.Logger;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.nicor.generic.BaseTest;
import com.nicor.pages.NicorHome;

public class TC_01_001 extends BaseTest
{	
	//private WebElement hospitalsLink;
	
	Logger log = Logger.getLogger("devpinoyLogger");
	
	

	//static Logger log = Logger.getLogger(TC_01_001.class.getName());

	@Test(groups = { "1st Module" })
	public void testHomePage() throws InterruptedException
	{
	
		log.info("***$$ Started TC_01_001  Test Home page $$**");
		
	String Hometitle="NICOR";
	
	NicorHome home=new NicorHome(driver);
	
	// to verify the title
	home.verifyTheTitle(Hometitle);
	
	
	// to verify the elements present in home page
	home.verifyTheElement(home.getHospitalsLink());
	log.info("hosp");
	//Reporter.log("hosp",true);
	
	home.verifyElement(home.getResearchersLink());
	log.debug("research");
	//Reporter.log("research",true);
	
	home.verifyTheElement(home.getCharitiesAndPublicLink());
	log.debug("research");
	//Reporter.log("charities and public",true);
	
	
	home.verifyTheElement(home.getOrganisationsLink());
	log.debug("organisations");
	//Reporter.log("organisations",true);
	
	home.verifyTheElement(home.getCommissionersLink());
	log.debug("commissioners");
	//Reporter.log("commissioners",true);
	
	home.verifyTheElement(home.getAuditProgrammelink());
	log.debug("audit programme");
	//Reporter.log("audit programme",true);
	
		
	
	}
	

}
