package com.nicor.tests;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.nicor.generic.BaseTest;
import com.nicor.pages.Glossary;
import com.nicor.pages.NicorHome;

public class TC_02_013 extends BaseTest
{
	String ForGlossarytitle="NICOR | Glossary";
	@Test
	public void testGlossaryPage()
	{
		
	String title="NICOR";
	
	NicorHome home=new NicorHome(driver);
	
	Glossary glo=new Glossary(driver);
	
	// to verify the title
	home.verifyTheTitle(title);
	
	home.clickOnAboutNicor();
	Reporter.log("clicked abt NICOR",true);
	
	home.clickOnGlossarylink();
	Reporter.log("clicked abt Glossarylink",true);
	
	glo.verifyTitle(ForGlossarytitle);
	
	glo.verifyTheElement(glo.getB());
	
	
	// to click on B 
	
	glo.clickOnBLink();
	
	
	// to verify the elements present in a section
	Reporter.log("elements present in a section",true);
	
	glo.verifyTheElement(glo.getBb());
	
	glo.verifyTheElement(glo.getBcca());
	
	glo.verifyTheElement(glo.getBcis());
	
	glo.verifyTheElement(glo.getBcs());
	
	glo.verifyTheElement(glo.getBhrs());
	
	glo.verifyTheElement(glo.getBms());
	
	glo.verifyTheElement(glo.getBsh());
	
	
	
	
	}
}
