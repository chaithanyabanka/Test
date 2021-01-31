package com.nicor.tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.nicor.generic.BaseTest;
import com.nicor.pages.Glossary;
import com.nicor.pages.NicorHome;

public class TC_02_004 extends BaseTest
{
	String title="NICOR";
	String ForGlossarytitle="NICOR | Glossary";
	String text="Angiotensin-converting enzyme inhibitors (ACE-Is) are a class of drug used after a heart attack and other causes of the heart muscle to weaken, to treat and prevent heart failure. They stop the body’s ability to produce angiotensin II, a hormone which causes blood vessels to contract, thus dilating blood vessels and increasing the supply of blood and oxygen to the heart.";
	@Test
	public void testGlossaryPage() 
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
	 
    glo.verifyTheElement(glo.getAcei());
    
   
    glo.clickOnACEILink();
    Reporter.log("clicked acei",true);
    
    // to verify the text present in acei
    
    String textacei=glo.getAcei().getText();
    
    
      
    SoftAssert sa=new SoftAssert();
    
    sa.assertEquals(text, textacei);
    
	
	
	}
	
	
	

}
