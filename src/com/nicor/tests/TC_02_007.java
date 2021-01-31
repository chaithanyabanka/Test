package com.nicor.tests;

import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.nicor.generic.BaseTest;
import com.nicor.pages.Glossary;
import com.nicor.pages.NicorHome;

public class TC_02_007 extends BaseTest
{
	String title="NICOR";
	String ForGlossarytitle="NICOR | Glossary";
	String text="Angiogram – an X-ray investigation performed under a local anaesthetic that produces images of the flow of blood within an artery (in this case the coronary artery). Narrowing and complete blockages within the arteries can be identified and this allows decisions to be made regarding treatment, such as primary percutaneous coronary intervention or coronary artery bypass grafting.";
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
	 
    glo.verifyTheElement(glo.getAngiogram());
    
    Thread.sleep(3000);
    
    Actions act=new Actions(driver);
    act.moveToElement(glo.getAngiogram()).click();
    act.perform();
    
    
    
    String angiogramText = glo.getAngiogramText().getText();
    
    SoftAssert  sa = new SoftAssert();
    
    sa.assertEquals(text, angiogramText);
	}

}


