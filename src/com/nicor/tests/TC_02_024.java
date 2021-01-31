package com.nicor.tests;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.nicor.generic.BaseTest;
import com.nicor.pages.Glossary;
import com.nicor.pages.NicorHome;

public class TC_02_024 extends BaseTest
{
	String title="NICOR";
	String ForGlossarytitle="NICOR | Glossary";
	String text="Refers to the different types of patients treated by a hospital or an operator.";
	@Test
	public void testGlossaryPage() throws InterruptedException
	{
		
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
	
	 glo.clickOnCLink();
	 
    glo.verifyTheElement(glo.getCaseMix());
    
    glo.clickOnElement(glo.getCaseMix());
    
    
    String casemixText = glo.getCaseMixText().getText();
    
    SoftAssert  sa = new SoftAssert();
    
    sa.assertEquals(text, casemixText);
	
	}



}
