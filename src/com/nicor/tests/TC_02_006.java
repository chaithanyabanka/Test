package com.nicor.tests;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.nicor.generic.BaseTest;
import com.nicor.pages.Glossary;
import com.nicor.pages.NicorHome;

public class TC_02_006 extends BaseTest
{
	String title="NICOR";
	String ForGlossarytitle="NICOR | Glossary";
	String text="Atrial fibrillation – a heart condition that causes an irregular and often abnormally fast heart rate. A normal heart rate should be regular and between 60 and 100 beats a minute when you’re resting. In atrial fibrillation, the heart rate is irregular and can sometimes be very fast. In some cases, it can be considerably higher than 100 beats a minute.";
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
	
	glo.verifyTheElement(glo.getA());
	
	 glo.clickOnALink();
	 
    glo.verifyTheElement(glo.getAf());
    
    
    glo.clickOnAfLink();
    
    String afText = glo.getAfText().getText();
    
    SoftAssert  sa = new SoftAssert();
    
    sa.assertEquals(text, afText);
	}

}
