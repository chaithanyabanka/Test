package com.nicor.tests;

import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.nicor.generic.BaseTest;
import com.nicor.pages.Glossary;
import com.nicor.pages.NicorHome;

public class TC_02_009 extends BaseTest 
{
	String title="NICOR";
	String ForGlossarytitle="NICOR | Glossary";
	String text="Aortic stenosis – one of the most common and most serious valve disease problems. Aortic stenosis is a narrowing of the aortic valve opening and restricts the blood flow from the left ventricle to the aorta. It may also affect the pressure in the left atrium. The condition mainly develops during aging as calcium or scarring damages the valve and restricts the amount of blood flowing through the valve.";
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
	 
    glo.verifyTheElement(glo.getAorticStenosis());
    
    Actions act=new Actions(driver);
    act.moveToElement(glo.getAorticStenosis()).click();
    act.perform();
    
    String aorticStenosisText = glo.getAorticStenosis().getText();
    
    SoftAssert  sa = new SoftAssert();
    
    sa.assertEquals(text, aorticStenosisText);
	}


}
