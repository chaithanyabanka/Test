package com.nicor.tests;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.nicor.generic.BaseTest;
import com.nicor.pages.Glossary;
import com.nicor.pages.NicorHome;

public class TC_02_026 extends BaseTest
{
	String title="NICOR";
	String ForGlossarytitle="NICOR | Glossary";
	String text="Clinical Commissioning Groups commission healthcare services for patients registered amongst their constituent GP Practices. They manage primary care commissioning and are responsible for commissioning healthcare including urgent and emergency care and elective hospital services.";
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
	 
    glo.verifyTheElement(glo.getCcgs());
    
    glo.clickOnElement(glo.getCcgs());
    
    
    String ccgsText = glo.getCcgsText().getText();
    
    SoftAssert  sa = new SoftAssert();
    
    sa.assertEquals(text, ccgsText);
	
	}



}
