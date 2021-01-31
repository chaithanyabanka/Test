package com.nicor.tests;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.nicor.generic.BaseTest;
import com.nicor.pages.Glossary;
import com.nicor.pages.NicorHome;

public class TC_02_021 extends BaseTest
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
	
	glo.verifyTheElement(glo.getC());
	
	
	// to click on C
	
	glo.clickOnCLink();
	
	
	// to verify the elements present in a section
	Reporter.log("elements present in a section",true);
	
	glo.verifyTheElement(glo.getCardiacRehabilitation());
	
	glo.verifyTheElement(glo.getCardiogenicShock());
	
	glo.verifyTheElement(glo.getCaseMix());
	
	glo.verifyTheElement(glo.getCcad());
	
	glo.verifyTheElement(glo.getCcgs());
	
	glo.verifyTheElement(glo.getChd());
	
	glo.verifyTheElement(glo.getCop());
	
	glo.verifyTheElement(glo.getCprd());
	
	glo.verifyTheElement(glo.getCrt());
	
	glo.verifyTheElement(glo.getCrtd());
	
	glo.verifyTheElement(glo.getCrtp());
	
	glo.verifyTheElement(glo.getCtb());
	
	glo.verifyTheElement(glo.getCtd());
	
	glo.verifyTheElement(glo.getCto());
	
	glo.verifyTheElement(glo.getCva());
	
	glo.verifyTheElement(glo.getCvd());
	
	}
}
