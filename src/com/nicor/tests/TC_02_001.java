package com.nicor.tests;

import org.testng.annotations.Test;

import com.nicor.generic.BaseTest;
import com.nicor.pages.AboutNICOR;
import com.nicor.pages.NicorHome;

public class TC_02_001 extends BaseTest
{
	@Test
	public void testAboutNicorPage()
	{
		String AboutNicorTitle="NICOR | About NICOR";
		NicorHome nh=new NicorHome(driver);
		nh.doubleClickAboutNicor();
		
		AboutNICOR an= new AboutNICOR(driver);
		
		an.verifyTitle(AboutNicorTitle);
		
	}

}
