package com.nicor.tests;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.nicor.generic.BaseTest;
import com.nicor.pages.Glossary;
import com.nicor.pages.NicorHome;

public class TC_02_005  extends BaseTest
{
	String title="NICOR";
	String ForGlossarytitle="NICOR | Glossary";
	String text="Acute coronary syndrome covers all episodes that result from sudden and spontaneous blockage or near blockage of a coronary artery, including heart attack and unstable angina.";
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
	 
    glo.verifyTheElement(glo.getAcs());
    
    
    glo.clickOnACSLink();
    
    String acsText = glo.getAcsText().getText();
    
    SoftAssert  sa = new SoftAssert();
    
    sa.assertEquals(text, acsText);
    
    
	}
    
    
   
   


}
