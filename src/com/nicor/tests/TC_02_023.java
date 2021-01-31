package com.nicor.tests;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.nicor.generic.BaseTest;
import com.nicor.pages.Glossary;
import com.nicor.pages.NicorHome;

public class TC_02_023 extends BaseTest
{
	String title="NICOR";
	String ForGlossarytitle="NICOR | Glossary";
	String text="This occurs if the heart suddenly can’t pump enough oxygen-rich blood to the body. The most common cause of cardiogenic shock is damage to the heart muscle from a severe heart attack.";
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
	 
    glo.verifyTheElement(glo.getCardiogenicShock());
    
    glo.clickOnElement(glo.getCardiogenicShock());
    
    
    String cardiogenicText = glo.getCardiogenicShockText().getText();
    
    SoftAssert  sa = new SoftAssert();
    
    sa.assertEquals(text, cardiogenicText);
	
	}


}
