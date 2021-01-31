package com.nicor.tests;

import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.nicor.generic.BaseTest;
import com.nicor.pages.Glossary;
import com.nicor.pages.NicorHome;

public class TC_02_019 extends BaseTest
{
	String title="NICOR";
	String ForGlossarytitle="NICOR | Glossary";
	String text="Bare metal stents are stents without a coating or covering. They are made of a mesh-like tube of thin wire.";
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
	
	glo.verifyTheElement(glo.getB());
	
	glo.clickOnBLink();
	 
    glo.verifyTheElement(glo.getBms());
    
    Actions act=new Actions(driver);
    act.moveToElement(glo.getBms()).click();
    act.perform();
    
    String bmsText = glo.getBmsText().getText();
    
    SoftAssert  sa = new SoftAssert();
    
    sa.assertEquals(text, bmsText);
	
	}


}
