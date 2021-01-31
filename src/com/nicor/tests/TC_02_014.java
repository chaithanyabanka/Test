package com.nicor.tests;

import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.nicor.generic.BaseTest;
import com.nicor.pages.Glossary;
import com.nicor.pages.NicorHome;

public class TC_02_014 extends BaseTest
{
	String title="NICOR";
	String ForGlossarytitle="NICOR | Glossary";
	String text="BB – Beta blockers are a group of medicines which slow the heart rate, decrease cardiac output and lessen the force of heart muscle and blood vessel contractions. They are used to treat abnormal or irregular heart rhythms, and abnormally fast heart rates, help prevent attacks of angina and are a key treatment for patients with heart failure.";
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
	 
    glo.verifyTheElement(glo.getBb());
    
    Actions act=new Actions(driver);
    act.moveToElement(glo.getBb()).click();
    act.perform();
    
    String bbText = glo.getBbText().getText();
    
    SoftAssert  sa = new SoftAssert();
    
    sa.assertEquals(text, bbText);
	
	}


}
