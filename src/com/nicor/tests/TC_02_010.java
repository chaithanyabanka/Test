package com.nicor.tests;

import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.nicor.generic.BaseTest;
import com.nicor.pages.Glossary;
import com.nicor.pages.NicorHome;

public class TC_02_010  extends BaseTest
{
	String title="NICOR";
	String ForGlossarytitle="NICOR | Glossary";
	String text1="Angiotensin II receptor antagonist/angiotensin receptor blocker. ARBs are a group of medicines usually prescribed for those patients who are intolerant of ACE inhibitors. Rather than lowering levels of angiotensin II, they instead prevent the chemical from having any effect on blood vessels.";
	String text2="Angina covers symptoms of chest pain that occur when narrowing of the coronary arteries prevent enough oxygen containing blood reaching the heart muscle when its demands are high, such as during exercise.";
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
	 
    glo.verifyTheElement(glo.getArb());
    
    Actions act=new Actions(driver);
    act.moveToElement(glo.getArb()).click();
    act.perform();
    
    String arbText1 = glo.getArbText1().getText();
    String arbText2 = glo.getArbText2().getText();
    
    SoftAssert  sa = new SoftAssert();
    
    sa.assertEquals(text1, arbText1);
    sa.assertEquals(text2, arbText2);
	}


}
