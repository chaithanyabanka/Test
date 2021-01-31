package com.nicor.tests;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.nicor.generic.BaseTest;
import com.nicor.pages.NICORForResearchers;
import com.nicor.pages.NicorHome;
public class TC_01_003 extends BaseTest
{
	String ForResearcherstitle="NICOR | For researchers";
	@Test(groups = { "1st Module" })
	public void testresearchersPage()
	{
		log.info("***$$ Started TC_01_003  Test Researches page $$**");
		
	String title="NICOR";
	
	NicorHome home=new NicorHome(driver);
	
	NICORForResearchers nfr=new NICORForResearchers(driver);
	
	// to verify the title
	home.verifyTheTitle(title);
	
	// to click on for researchers link
	home.clickOnresearchersLink();
	log.info("clicked researchers");

	Reporter.log("clicked researchers",true);
	
	// to verify the title of for researchers page
	nfr.verifyTitle(ForResearcherstitle);
	
	
	
	
	}
	

}
