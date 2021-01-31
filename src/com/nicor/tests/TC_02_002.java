package com.nicor.tests;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.nicor.generic.BaseTest;

import com.nicor.pages.Glossary;

import com.nicor.pages.NicorHome;

public class TC_02_002 extends BaseTest
{
	String ForGlossarytitle="NICOR | Glossary";
	@Test
	public void testGlossaryPage()
	{
		
	String title="NICOR";
	
	NicorHome home=new NicorHome(driver);
	
	Glossary glo=new Glossary(driver);
	
	// to verify the title
	home.verifyTheTitle(title);
	
	home.clickOnAboutNicor();
	Reporter.log("clicked abt NICOR",true);
	
	home.clickOnGlossarylink();
	Reporter.log("clicked abt Glossarylink",true);
	
	glo.verifyTitle(ForGlossarytitle);
	
	// to verify the all elements present in glossary page
	
	glo.verifyTheElement(glo.getA());
	
	glo.verifyTheElement(glo.getB());
	
	glo.verifyTheElement(glo.getC());
	
	glo.verifyTheElement(glo.getD());
	
	glo.verifyTheElement(glo.getE());
	
	glo.verifyTheElement(glo.getI());
	
	glo.verifyTheElement(glo.getL());
	
	glo.verifyTheElement(glo.getM());
	
	glo.verifyTheElement(glo.getN());
	
	glo.verifyTheElement(glo.getS());
	
	glo.verifyTheElement(glo.getR());
	
	glo.verifyTheElement(glo.getS());
	
	glo.verifyTheElement(glo.getT());
	
	glo.verifyTheElement(glo.getU());
	
	
	
	
	
	}

}
