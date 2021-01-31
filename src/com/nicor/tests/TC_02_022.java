package com.nicor.tests;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.nicor.generic.BaseTest;
import com.nicor.pages.Glossary;
import com.nicor.pages.NicorHome;

public class TC_02_022 extends BaseTest
{
	String title="NICOR";
	String ForGlossarytitle="NICOR | Glossary";
	String text="A programme of exercise and information sessions designed to help patients who have had a heart attack and reduce their risk of a further heart event.";
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
	 
    glo.verifyTheElement(glo.getCardiacRehabilitation());
    
    glo.clickOnElement(glo.getCardiacRehabilitation());
    
    
    String cardiacText = glo.getCardiacRehabilitationText().getText();
    
    SoftAssert  sa = new SoftAssert();
    
    sa.assertEquals(text, cardiacText);
	
	}


}
