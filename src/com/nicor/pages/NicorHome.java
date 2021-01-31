package com.nicor.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nicor.generic.BasePage;

public class NicorHome extends BasePage
{
	//Declaration
	@FindBy(xpath="//span[contains(text(),'Hospitals')]")
	private WebElement hospitalsLink;
	
	@FindBy(xpath="//span[contains(text(),'Researchers')]")
	private WebElement researchersLink;

	@FindBy(xpath="//span[contains(text(),'Charities & Public')]")
	private WebElement charitiesAndPublicLink;

	@FindBy(xpath="//span[contains(text(),'Organisations')]")
	private WebElement OrganisationsLink;

	@FindBy(xpath="//span[contains(text(),'Commissioners')]")
	private WebElement commissionersLink;

	@FindBy(xpath="//span[contains(text(),'Audit Programme')]")
	private WebElement auditProgrammelink;
   
	@FindBy(xpath="//*[@id=\"menu-item-36\"]/a")
	private WebElement aboutNICORlink;

	@FindBy(xpath="//*[@id=\"menu-item-354\"]/a")
	private WebElement glossarylink;
	
	@FindBy(xpath="//*[@id=\"menu-item-45\"]/a")
	private WebElement NewsandEventslink;
	
	
	@FindBy(xpath="//*[@id=\"menu-item-52\"]/a")
	private WebElement eventCalendarlink;
	
	
	@FindBy(xpath="//*[@id=\"menu-item-53\"]/a")
	private WebElement newslettersBloglink;
	
	@FindBy(xpath="//*[@id=\"menu-item-37\"]/a")
	private WebElement contactUslink;
	
	@FindBy(xpath="//*[@id=\"menu-item-41\"]/a")
	private WebElement forPatientsCarersCharitiesandThePubliclink;
	
	@FindBy(xpath="//*[@id=\"menu-item-842\"]/a")
	private WebElement whyDoesnicorCollectmyHealthDatalink;
	
	@FindBy(xpath="//*[@id=\"menu-item-849\"]/a")
	private WebElement HowdoesNicorProtectmyDatalink;
	
	@FindBy(xpath="//*[@id=\"menu-item-40\"]/a")
	private WebElement forHospitalClinicalandAuditTeamslink;
	
	@FindBy(xpath="//*[@id=\"menu-item-814\"]/a")
	private WebElement dataCollectionlink;
	
	@FindBy(xpath="//*[@id=\"menu-item-42\"]/a")
	private WebElement forResearcherslink;
	
	@FindBy(xpath="//*[@id=\"menu-item-39\"]/a")
	private WebElement forHealthOrganisationsandRegulatorslink;
	
	@FindBy(xpath="//*[@id=\"menu-item-38\"]/a")
	private WebElement forCommisionersofHealthcareServiceslink;
	
	@FindBy(xpath="//*[@id=\"menu-item-43\"]/a")
	private WebElement informationGovernanceandDataProtectionlink;
	
	@FindBy(xpath="//*[@id=\"menu-item-813\"]/a")
	private WebElement dataManagementlink;
	
	@FindBy(xpath="//*[@id=\"menu-item-44\"]/a")
	private WebElement nationalCardiacAuditProgrammelink;
	
	@FindBy(xpath="//*[@id=\"menu-item-1018\"]/a")
	private WebElement adultCardiacSurgerylink;
	
	@FindBy(xpath="//*[@id=\"menu-item-79\"]/a")
	private WebElement aboutAdultSurgerylink;
	
	@FindBy(xpath="//*[@id=\"menu-item-81\"]/a")
	private WebElement additionalAnalysesCommencelink;
	
	@FindBy(xpath="//*[@id=\"menu-item-149\"]/a")
	private WebElement adultPercutaneousCoronaryInterventionslink;
	
	@FindBy(xpath="//*[@id=\"menu-item-162\"]/a")
	private WebElement cardiacRhythmManagementlink;
	
	@FindBy(xpath="//*[@id=\"menu-item-163\"]/a")
	private WebElement congentialHeartDiseaseinChildrenandAdultslink;
	
	@FindBy(xpath="//*[@id=\"menu-item-164\"]/a")
	private WebElement heartFailurelink;
	
	@FindBy(xpath="//*[@id=\"menu-item-165\"]/a")
	private WebElement myocardialIschaemialink;
	
	@FindBy(xpath="//*[@id=\"menu-item-1001\"]/a")
	private WebElement datasetslink;
	
	@FindBy(xpath="//*[@id=\"menu-item-177\"]/a")
	private WebElement nicoranddatagovuklink;
	
	@FindBy(xpath="//*[@id=\"menu-item-176\"]/a")
	private WebElement govCardiacRhythmManagementlink;
	
	@FindBy(xpath="//*[@id=\"menu-item-175\"]/a")
	private WebElement congentialHeartDiseaseAuditlink;
	
	@FindBy(xpath="//*[@id=\"menu-item-174\"]/a")
	private WebElement nationalAdulTCardiacSurgeryAuditlink;
	
	@FindBy(xpath="//*[@id=\"menu-item-173\"]/a")
	private WebElement nationalAuditofPercutaneousCoronaryInterventionslink;
	
	@FindBy(xpath="//*[@id=\"menu-item-172\"]/a")
	private WebElement nationalHeartFailureAuditlink;
	
	@FindBy(xpath="//*[@id=\"menu-item-171\"]/a")
	private WebElement minaplink;
	
	@FindBy(xpath="//*[@id=\"menu-item-46\"]/a")
	private WebElement otherNicorProjectslink;
	
	@FindBy(xpath="//*[@id=\"menu-item-47\"]/a")
	private WebElement sitemaplink;
	
	
	
	// Initialization
	
	public NicorHome(WebDriver driver)
	
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	
	
	// Utilization
	public void verifyTheTitle(String eTitle)
	{
		verifyTitle(eTitle);
	}
	
	public void verifyTheElement(WebElement element)
	{
		verifyElement(element);
	}
	
	
	
	public void clickOnhospitalsLink()
	{
		hospitalsLink.click();
		
	}
	
	public void clickOnresearchersLink()
	{
		researchersLink.click();
	}
	
	public void clickOncharitiesAndPublicLink()
	{
		charitiesAndPublicLink.click();
	}
	
	public void clickOnOrganisationsLink()
	{
		OrganisationsLink.click();
	}
	
	public void clickOncommissionersLink()
	{
		commissionersLink.click();
	}
	
	public void clickOnauditProgrammelink()
	{
		auditProgrammelink.click();
	}
	
	public void doubleClickAboutNicor()
	{
	   /*
	    *Actions acts=new Actions(driver);
		*acts.doubleClick(aboutNICORlink);
		*acts.perform();
		*/
		aboutNICORlink.click();
		aboutNICORlink.click();
		
	}
	
	public void clickOnAboutNicor()
	{
		aboutNICORlink.click();
			
	}
	
	public void clickOnGlossarylink()
	{
		glossarylink.click();
			
	}
	
	// ALL GETTERS AND SETTERS
	public WebElement getAboutNICORlink() {
		return aboutNICORlink;
	}



	public void setAboutNICORlink(WebElement aboutNICORlink) {
		this.aboutNICORlink = aboutNICORlink;
	}

		public WebElement getHospitalsLink() {
		return hospitalsLink;
	}



	public void setHospitalsLink(WebElement hospitalsLink) {
		this.hospitalsLink = hospitalsLink;
	}



	public WebElement getResearchersLink() {
		return researchersLink;
	}



	public void setResearchersLink(WebElement researchersLink) {
		this.researchersLink = researchersLink;
	}



	public WebElement getCharitiesAndPublicLink() {
		return charitiesAndPublicLink;
	}



	public void setCharitiesAndPublicLink(WebElement charitiesAndPublicLink) {
		this.charitiesAndPublicLink = charitiesAndPublicLink;
	}



	public WebElement getOrganisationsLink() {
		return OrganisationsLink;
	}



	public void setOrganisationsLink(WebElement organisationsLink) {
		OrganisationsLink = organisationsLink;
	}



	public WebElement getCommissionersLink() {
		return commissionersLink;
	}



	public void setCommissionersLink(WebElement commissionersLink) {
		this.commissionersLink = commissionersLink;
	}



	public WebElement getAuditProgrammelink() {
		return auditProgrammelink;
	}



	public void setAuditProgrammelink(WebElement auditProgrammelink) {
		this.auditProgrammelink = auditProgrammelink;
	}

	

}
