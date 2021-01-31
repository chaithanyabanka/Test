package com.nicor.tests;

import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.nicor.generic.BaseTest;
import com.nicor.pages.Glossary;
import com.nicor.pages.NicorHome;

public class TC_02_015 extends BaseTest
{
	String title="NICOR";
	String ForGlossarytitle="NICOR | Glossary";
	String text="BCCA – British Congenital Cardiac Association.";
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
	 
    glo.verifyTheElement(glo.getBcca());
    
    Actions act=new Actions(driver);
    act.moveToElement(glo.getBcca()).click();
    act.perform();
    
    String bccaText = glo.getBccaText().getText();
    
    SoftAssert  sa = new SoftAssert();
    
    sa.assertEquals(text, bccaText);
	
	}


}
