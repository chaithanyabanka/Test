package com.nicor.tests;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.nicor.generic.BaseTest;
import com.nicor.pages.Glossary;
import com.nicor.pages.NicorHome;

public class TC_02_003 extends BaseTest
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
	
	glo.verifyTheElement(glo.getA());
	
	
	// to click on A 
	
	glo.clickOnALink();
	
	
	// to verify the elements present in a section
	Reporter.log("elements present in a section",true);
	
	glo.verifyTheElement(glo.getAcei());
	
	glo.verifyTheElement(glo.getAcs());
	
	glo.verifyTheElement(glo.getAf());
	
	glo.verifyTheElement(glo.getAngiogram());
	
	glo.verifyTheElement(glo.getAngiography());
	
	glo.verifyTheElement(glo.getAorticStenosis());
	
	glo.verifyTheElement(glo.getArb());
	
	glo.verifyTheElement(glo.getAtherosclerosis());
	
	glo.verifyTheElement(glo.getAtrialFibrillation());
	
	Reporter.log("all elements are present in a section",true);	
	
	}
	

}
