package com.nicor.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nicor.generic.BasePage;


public class Glossary extends BasePage
{
	
	// Declaration
	@FindBy(xpath=".//h3[.='A']")
	private WebElement a;
	
	@FindBy(id="ace-i")
	private WebElement acei;
	
	@FindBy(xpath="//p[contains(text(),'Angiotensin-converting enzyme inhibitors (ACE-Is)')]")
	private WebElement aceiText;
	
	@FindBy(id="acs")
	private WebElement acs;
	
	@FindBy(xpath="//p[contains(text(),'Acute coronary syndrome')]")
	private WebElement acsText;
	
	@FindBy(id="af")
	private WebElement af;
	
	@FindBy(xpath="//p[contains(text(),'Atrial fibrillation')]")
	private WebElement afText;

	
	@FindBy(id="angiogram")
	private WebElement angiogram;
	
	@FindBy(xpath="//p[contains(text(),'Angiogram – an X-ray investigation')]")
	private WebElement angiogramText;

	
	@FindBy(id="angiography")
	private WebElement angiography;
	
	@FindBy(xpath="//p[contains(text(),'Angiography – the')]")
	private WebElement angiographyText;

	
	@FindBy(id="aortic-stenosis")
	private WebElement aorticStenosis;
	
	@FindBy(xpath="//p[contains(text(),'Aortic stenosis – one of the most')]")
	private WebElement aorticStenosisText;

	
	@FindBy(id="arb")
	private WebElement arb;
	
	@FindBy(xpath="//p[contains(text(),'Angiotensin II receptor antagonist/angiotensin')]")
	private WebElement arbText1;
	
	@FindBy(xpath="//p[contains(text(),'Angina covers symptoms of chest')]")
	private WebElement arbText2;

	@FindBy(id="atherosclerosis")
	private WebElement atherosclerosis;
	
	@FindBy(xpath="//p[contains(text(),'Atherosclerosis – a process')]")
	private WebElement atherosclerosisText;

	@FindBy(id="atrial-fibrillation")
	private WebElement atrialFibrillation;
	
	@FindBy(xpath="//p[contains(text(),'Atrial Fibrillation (AF)')]")
	private WebElement atrialFibrillationText;


	@FindBy(xpath=".//h3[.='B']")
	private WebElement b;
	
	

	
	@FindBy(id="bb")
	private WebElement bb;
	
	@FindBy(xpath="//p[contains(text(),'BB – Beta blockers are a group')]")
	private WebElement bbText;


	@FindBy(id="bcca")
	private WebElement bcca;
	
	@FindBy(xpath="//p[contains(text(),'BCCA – British')]")
	private WebElement bccaText;

	@FindBy(id="bcis")
	private WebElement bcis;
	
	@FindBy(xpath="//p[contains(text(),'British Cardiovascular')]")
	private WebElement bcisText;

	@FindBy(id="bcs")
	private WebElement bcs;

	@FindBy(xpath="//p[contains(text(),'British Cardiovascular')]")
	private WebElement bcsText;
	
	
	@FindBy(id="bhrs")
	private WebElement bhrs;
	
	@FindBy(xpath="//p[contains(text(),'British Heart')]")
	private WebElement bhrsText;

	@FindBy(id="bms")
	private WebElement bms;
	
	@FindBy(xpath="//p[contains(text(),'Bare metal stents are stents')]")
	private WebElement bmsText;

	@FindBy(id="bsh")
	private WebElement bsh;
	
	@FindBy(xpath="//p[contains(text(),'British Society')]")
	private WebElement bshText;

	
	@FindBy(xpath=".//h3[.='C']")
	private WebElement c;
	
	@FindBy(id="cardiac-rehabilitation")
	private WebElement cardiacRehabilitation;
	
	@FindBy(xpath="//p[contains(text(),'A programme of exercise and information sessions designed')]")
	private WebElement cardiacRehabilitationText;

	@FindBy(id="cardiogenic-shock")
	private WebElement cardiogenicShock;
	
	@FindBy(xpath="//p[contains(text(),'This occurs if the heart suddenly can’t pump enough oxygen-rich')]")
	private WebElement cardiogenicShockText;

	@FindBy(id="case-mix")
	private WebElement caseMix;
	
	@FindBy(xpath="//p[contains(text(),'Refers to the different types')]")
	private WebElement caseMixText;

	@FindBy(id="ccad")
	private WebElement ccad;
	
	
	@FindBy(xpath="//p[contains(text(),'Central Cardiac')]")
	private WebElement ccadText;

	@FindBy(id="ccgs")
	private WebElement ccgs;
	
	@FindBy(xpath="//p[contains(text(),'Clinical Commissioning Groups commission')]")
	private WebElement ccgsText;

	@FindBy(id="chd")
	private WebElement chd;
	
	@FindBy(xpath="//p[contains(text(),'Coronary heart disease is a group')]")
	private WebElement chdText;

	@FindBy(id="cop")
	private WebElement cop;
	
	@FindBy(xpath="//p[contains(text(),'Clinical Outcomes Publication. COP')]")
	private WebElement copText;

	@FindBy(id="cprd")
	private WebElement cprd;
	
	@FindBy(xpath="//p[contains(text(),'Clinical Practice')]")
	private WebElement cprdText;

	@FindBy(id="crt")
	private WebElement crt;
	
	@FindBy(xpath="//p[contains(text(),'Cardiac resynchronisation therapy')]")
	private WebElement crtText;

	@FindBy(id="crt-d")
	private WebElement crtd;
	
	@FindBy(xpath="//p[contains(text(),'Cardiac resynchronisation')]")
	private WebElement crtdText;

	@FindBy(id="crt-p")
	private WebElement crtp;
	
	@FindBy(xpath="//p[contains(text(),'Cardiac resynchronisation')]")
	private WebElement crtpText;

	@FindBy(id="ctb")
	private WebElement ctb;
	
	@FindBy(xpath="//p[contains(text(),'Call to balloon time in heart')]")
	private WebElement ctbText;

	@FindBy(id="ctd")
	private WebElement ctd;
	
	@FindBy(xpath="//p[contains(text(),'Call to Door in heart attack')]")
	private WebElement ctdText;

	@FindBy(id="cto")
	private WebElement cto;
	
	@FindBy(xpath="//p[contains(text(),'Chronic total occlusions')]")
	private WebElement ctoText;

	@FindBy(id="cva")
	private WebElement cva;
	
	@FindBy(xpath="//p[contains(text(),'Cerebrovascular accident is the medical')]")
	private WebElement cvaText;

	@FindBy(id="cvd")
	private WebElement cvd;
	
	@FindBy(xpath="//p[contains(text(),'Cardiovascular disease is a general')]")
	private WebElement cvdText;


	
	@FindBy(xpath=".//h3[.='D']")
	private WebElement d;
	
	@FindBy(xpath=".//h3[.='E']")
	private WebElement e;
	
	@FindBy(xpath=".//h3[.='H']")
	private WebElement h;
	
	@FindBy(xpath=".//h3[.='I']")
	private WebElement i;
	

	@FindBy(xpath=".//h3[.='L']")
	private WebElement l;
	
	@FindBy(xpath=".//h3[.='M']")
	private WebElement m;
	
	@FindBy(xpath=".//h3[.='N']")
	private WebElement n;
	
	@FindBy(xpath=".//h3[.='P']")
	private WebElement p;
	
	@FindBy(xpath=".//h3[.='R']")
	private WebElement r;
	
	@FindBy(xpath=".//h3[.='S']")
	private WebElement s;
	
	@FindBy(xpath=".//h3[.='T']")
	private WebElement t;
	
	@FindBy(xpath=".//h3[.='U']")
	private WebElement u;
	

	
	// ALL THE GETTERS AND SETTERRS FOR GLOSSARY PAGE
	
	public WebElement getA() {
		return a;
	}



	public void setA(WebElement a) {
		this.a = a;
	}
	
	public WebElement getAcei() {
		return acei;
	}



	public void setAcei(WebElement acei) {
		this.acei = acei;
	}



	public WebElement getAceiText() {
		return aceiText;
	}



	public void setAceiText(WebElement aceiText) {
		this.aceiText = aceiText;
	}



	public WebElement getAcs() {
		return acs;
	}



	public void setAcs(WebElement acs) {
		this.acs = acs;
	}



	public WebElement getAf() {
		return af;
	}



	public void setAf(WebElement af) {
		this.af = af;
	}



	public WebElement getAngiogram() {
		return angiogram;
	}



	public void setAngiogram(WebElement angiogram) {
		this.angiogram = angiogram;
	}



	public WebElement getAngiography() {
		return angiography;
	}



	public void setAngiography(WebElement angiography) {
		this.angiography = angiography;
	}



	public WebElement getAorticStenosis() {
		return aorticStenosis;
	}



	public void setAorticStenosis(WebElement aorticStenosis) {
		this.aorticStenosis = aorticStenosis;
	}



	public WebElement getArb() {
		return arb;
	}



	public void setArb(WebElement arb) {
		this.arb = arb;
	}



	public WebElement getAtherosclerosis() {
		return atherosclerosis;
	}



	public void setAtherosclerosis(WebElement atherosclerosis) {
		this.atherosclerosis = atherosclerosis;
	}



	public WebElement getAtrialFibrillation() {
		return atrialFibrillation;
	}



	public void setAtrialFibrillation(WebElement atrialFibrillation) {
		this.atrialFibrillation = atrialFibrillation;
	}



	public WebElement getB() {
		return b;
	}



	public void setB(WebElement b) {
		this.b = b;
	}



	public WebElement getBb() {
		return bb;
	}



	public void setBb(WebElement bb) {
		this.bb = bb;
	}



	public WebElement getBcca() {
		return bcca;
	}



	public void setBcca(WebElement bcca) {
		this.bcca = bcca;
	}



	public WebElement getBcis() {
		return bcis;
	}



	public void setBcis(WebElement bcis) {
		this.bcis = bcis;
	}



	public WebElement getBcs() {
		return bcs;
	}



	public void setBcs(WebElement bcs) {
		this.bcs = bcs;
	}



	public WebElement getBhrs() {
		return bhrs;
	}



	public void setBhrs(WebElement bhrs) {
		this.bhrs = bhrs;
	}



	public WebElement getBms() {
		return bms;
	}



	public void setBms(WebElement bms) {
		this.bms = bms;
	}



	public WebElement getBsh() {
		return bsh;
	}



	public void setBsh(WebElement bsh) {
		this.bsh = bsh;
	}



	public WebElement getC() {
		return c;
	}



	public void setC(WebElement c) {
		this.c = c;
	}



	public WebElement getD() {
		return d;
	}



	public void setD(WebElement d) {
		this.d = d;
	}



	public WebElement getE() {
		return e;
	}



	public void setE(WebElement e) {
		this.e = e;
	}



	public WebElement getH() {
		return h;
	}



	public void setH(WebElement h) {
		this.h = h;
	}



	public WebElement getI() {
		return i;
	}



	public void setI(WebElement i) {
		this.i = i;
	}



	public WebElement getL() {
		return l;
	}



	public void setL(WebElement l) {
		this.l = l;
	}



	public WebElement getM() {
		return m;
	}



	public void setM(WebElement m) {
		this.m = m;
	}



	public WebElement getN() {
		return n;
	}



	public void setN(WebElement n) {
		this.n = n;
	}



	public WebElement getP() {
		return p;
	}



	public void setP(WebElement p) {
		this.p = p;
	}



	public WebElement getR() {
		return r;
	}



	public void setR(WebElement r) {
		this.r = r;
	}



	public WebElement getS() {
		return s;
	}



	public void setS(WebElement s) {
		this.s = s;
	}



	public WebElement getT() {
		return t;
	}



	public void setT(WebElement t) {
		this.t = t;
	}



	public WebElement getU() {
		return u;
	}



	public void setU(WebElement u) {
		this.u = u;
	}
	
	public WebElement getAcsText() {
		return acsText;
	}



	public void setAcsText(WebElement acsText) {
		this.acsText = acsText;
	}



	public WebElement getAfText() {
		return afText;
	}



	public void setAfText(WebElement afText) {
		this.afText = afText;
	}



	public WebElement getAngiogramText() {
		return angiogramText;
	}



	public void setAngiogramText(WebElement angiogramText) {
		this.angiogramText = angiogramText;
	}



	public WebElement getAngiographyText() {
		return angiographyText;
	}



	public void setAngiographyText(WebElement angiographyText) {
		this.angiographyText = angiographyText;
	}



	public WebElement getAorticStenosisText() {
		return aorticStenosisText;
	}



	public void setAorticStenosisText(WebElement aorticStenosisText) {
		this.aorticStenosisText = aorticStenosisText;
	}



	public WebElement getArbText1() {
		return arbText1;
	}



	public void setArbText1(WebElement arbText1) {
		this.arbText1 = arbText1;
	}



	public WebElement getArbText2() {
		return arbText2;
	}



	public void setArbText2(WebElement arbText2) {
		this.arbText2 = arbText2;
	}



	public WebElement getAtherosclerosisText() {
		return atherosclerosisText;
	}



	public void setAtherosclerosisText(WebElement atherosclerosisText) {
		this.atherosclerosisText = atherosclerosisText;
	}



	public WebElement getAtrialFibrillationText() {
		return atrialFibrillationText;
	}



	public void setAtrialFibrillationText(WebElement atrialFibrillationText) {
		this.atrialFibrillationText = atrialFibrillationText;
	}



	public WebElement getBbText() {
		return bbText;
	}



	public void setBbText(WebElement bbText) {
		this.bbText = bbText;
	}



	public WebElement getBccaText() {
		return bccaText;
	}



	public void setBccaText(WebElement bccaText) {
		this.bccaText = bccaText;
	}



	public WebElement getBcisText() {
		return bcisText;
	}



	public void setBcisText(WebElement bcisText) {
		this.bcisText = bcisText;
	}



	public WebElement getBcsText() {
		return bcsText;
	}



	public void setBcsText(WebElement bcsText) {
		this.bcsText = bcsText;
	}



	public WebElement getBhrsText() {
		return bhrsText;
	}



	public void setBhrsText(WebElement bhrsText) {
		this.bhrsText = bhrsText;
	}



	public WebElement getBmsText() {
		return bmsText;
	}



	public void setBmsText(WebElement bmsText) {
		this.bmsText = bmsText;
	}



	public WebElement getBshText() {
		return bshText;
	}



	public void setBshText(WebElement bshText) {
		this.bshText = bshText;
	}
	
	public WebElement getCardiacRehabilitation() {
		return cardiacRehabilitation;
	}



	public void setCardiacRehabilitation(WebElement cardiacRehabilitation) {
		this.cardiacRehabilitation = cardiacRehabilitation;
	}



	public WebElement getCardiacRehabilitationText() {
		return cardiacRehabilitationText;
	}



	public void setCardiacRehabilitationText(WebElement cardiacRehabilitationText) {
		this.cardiacRehabilitationText = cardiacRehabilitationText;
	}



	public WebElement getCardiogenicShock() {
		return cardiogenicShock;
	}



	public void setCardiogenicShock(WebElement cardiogenicShock) {
		this.cardiogenicShock = cardiogenicShock;
	}



	public WebElement getCardiogenicShockText() {
		return cardiogenicShockText;
	}



	public void setCardiogenicShockText(WebElement cardiogenicShockText) {
		this.cardiogenicShockText = cardiogenicShockText;
	}



	public WebElement getCaseMix() {
		return caseMix;
	}



	public void setCaseMix(WebElement caseMix) {
		this.caseMix = caseMix;
	}



	public WebElement getCaseMixText() {
		return caseMixText;
	}



	public void setCaseMixText(WebElement caseMixText) {
		this.caseMixText = caseMixText;
	}



	public WebElement getCcad() {
		return ccad;
	}



	public void setCcad(WebElement ccad) {
		this.ccad = ccad;
	}



	public WebElement getCcadText() {
		return ccadText;
	}



	public void setCcadText(WebElement ccadText) {
		this.ccadText = ccadText;
	}



	public WebElement getCcgs() {
		return ccgs;
	}



	public void setCcgs(WebElement ccgs) {
		this.ccgs = ccgs;
	}



	public WebElement getCcgsText() {
		return ccgsText;
	}



	public void setCcgsText(WebElement ccgsText) {
		this.ccgsText = ccgsText;
	}



	public WebElement getChd() {
		return chd;
	}



	public void setChd(WebElement chd) {
		this.chd = chd;
	}



	public WebElement getChdText() {
		return chdText;
	}



	public void setChdText(WebElement chdText) {
		this.chdText = chdText;
	}



	public WebElement getCop() {
		return cop;
	}



	public void setCop(WebElement cop) {
		this.cop = cop;
	}



	public WebElement getCopText() {
		return copText;
	}



	public void setCopText(WebElement copText) {
		this.copText = copText;
	}



	public WebElement getCprd() {
		return cprd;
	}



	public void setCprd(WebElement cprd) {
		this.cprd = cprd;
	}



	public WebElement getCprdText() {
		return cprdText;
	}



	public void setCprdText(WebElement cprdText) {
		this.cprdText = cprdText;
	}



	public WebElement getCrt() {
		return crt;
	}



	public void setCrt(WebElement crt) {
		this.crt = crt;
	}



	public WebElement getCrtText() {
		return crtText;
	}



	public void setCrtText(WebElement crtText) {
		this.crtText = crtText;
	}



	public WebElement getCrtd() {
		return crtd;
	}



	public void setCrtd(WebElement crtd) {
		this.crtd = crtd;
	}



	public WebElement getCrtdText() {
		return crtdText;
	}



	public void setCrtdText(WebElement crtdText) {
		this.crtdText = crtdText;
	}



	public WebElement getCrtp() {
		return crtp;
	}



	public void setCrtp(WebElement crtp) {
		this.crtp = crtp;
	}



	public WebElement getCrtpText() {
		return crtpText;
	}



	public void setCrtpText(WebElement crtpText) {
		this.crtpText = crtpText;
	}



	public WebElement getCtb() {
		return ctb;
	}



	public void setCtb(WebElement ctb) {
		this.ctb = ctb;
	}



	public WebElement getCtbText() {
		return ctbText;
	}



	public void setCtbText(WebElement ctbText) {
		this.ctbText = ctbText;
	}



	public WebElement getCtd() {
		return ctd;
	}



	public void setCtd(WebElement ctd) {
		this.ctd = ctd;
	}



	public WebElement getCtdText() {
		return ctdText;
	}



	public void setCtdText(WebElement ctdText) {
		this.ctdText = ctdText;
	}



	public WebElement getCto() {
		return cto;
	}



	public void setCto(WebElement cto) {
		this.cto = cto;
	}



	public WebElement getCtoText() {
		return ctoText;
	}



	public void setCtoText(WebElement ctoText) {
		this.ctoText = ctoText;
	}



	public WebElement getCva() {
		return cva;
	}



	public void setCva(WebElement cva) {
		this.cva = cva;
	}



	public WebElement getCvaText() {
		return cvaText;
	}



	public void setCvaText(WebElement cvaText) {
		this.cvaText = cvaText;
	}



	public WebElement getCvd() {
		return cvd;
	}



	public void setCvd(WebElement cvd) {
		this.cvd = cvd;
	}



	public WebElement getCvdText() {
		return cvdText;
	}



	public void setCvdText(WebElement cvdText) {
		this.cvdText = cvdText;
	}


	
	
	
	
	
	// Initialization
		public Glossary(WebDriver driver) 
		{
			super(driver);
			PageFactory.initElements(driver, this);
		}
		
		
		
		
	
	// utilization
		
		public void verifyTheTitle(String eTitle)
		{
			verifyTitle(eTitle);
		}
		
		public void verifyTheElement(WebElement element)
		{
			verifyElement(element);
		}
		
		public void clickOnALink()
		{
			a.click();
			
		}
		
		public void clickOnACEILink()
		{
			acei.click();
			
		}
		
		public void clickOnACSLink()
		{
			acs.click();
			
		}

		
		public void clickOnAfLink()
		{
			af.click();
			
		}
		
		public void clickOnAngiogranLink()
		{
			angiogram.click();
			
		}
		
		public void clickOnAngiographyLink()
		{
			angiography.click();
			
		}
		
		public void clickOnAorticStenosisLink()
		{
			aorticStenosis.click();
			
		}
		
		public void clickOnArbLink()
		{
			arb.click();
			
		}
		
		public void clickOnAtherosclerosisLink()
		{
			atherosclerosis.click();
			
		}
		
		public void clickOnAtrialFibrillationLink()
		{
			atrialFibrillation.click();
			
		}
		
		public void clickOnBLink()
		{
			b.click();
			
		}
		
		public void clickOnBbLink()
		{
			bb.click();
			
		}
		
		public void clickOnBccaLink()
		{
			bcca.click();
			
		}
		
		public void clickOnBcisLink()
		{
			bcis.click();
			
		}
		
		public void clickOnBcsLink()
		{
			bcs.click();
			
		}
		
		public void clickOnBhrsLink()
		{
			bhrs.click();
			
		}
		
		public void clickOnBmsLink()
		{
			bms.click();
			
		}
		
		public void clickOnBshLink()
		{
			bsh.click();
			
		}
		
		public void clickOnCLink()
		{
			c.click();
			
		}
		
		
		public void clickOnDLink()
		{
			d.click();
			
		}
		
		public void clickOnELink()
		{
			e.click();
			
		}
		
		public void clickOnHLink()
		{
			h.click();
			
		}
		
		public void clickOnILink()
		{
			i.click();
			
		}
		
		public void clickOnLLink()
		{
			l.click();
			
		}
		
		public void clickOnNLink()
		{
			n.click();
			
		}
		
		public void clickOnPLink()
		{
			p.click();
			
		}
		
		public void clickOnRLink()
		{
			r.click();
			
		}
		
		public void clickOnSLink()
		{
			s.click();
			
		}
		
		public void clickOnTLink()
		{
			t.click();
			
		}
		
		public void clickOnULink()
		{
			u.click();
			
		}
		
		

}
