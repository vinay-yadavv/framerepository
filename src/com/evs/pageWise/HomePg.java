package com.evs.pageWise;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.evs.genericMethad.GenericMethad;

public class HomePg {
	
	@FindBy(xpath = "//tr[@id='headerrow_14']//td[@align='right']")
	private WebElement drag;
	@FindBy(xpath ="//tr[@id='headerrow_12']//td[@align='right']" )
	private WebElement drop;
	@FindBy(xpath = "//a[text()='Marketing']")
	private WebElement marketing;
	@FindBy(xpath ="//div[@id='Marketing_sub']//a[text()='Leads']" )
	private WebElement clickLeadsBt;
	
	public MarketingLeads validHomePage(GenericMethad gm) {
		gm.dragAndDrop(drag, drop);
		gm.mouseover(marketing);
		gm.click(clickLeadsBt);
		MarketingLeads market_lead=PageFactory.initElements(gm.getDriver(),MarketingLeads.class);
		market_lead.valid_marketingLeads(gm, "vinay", "yadav", "expart wive satution", "@gmail.com");
		return market_lead;
	}
	public void invalidHomePage() {
		
		
	}

}
