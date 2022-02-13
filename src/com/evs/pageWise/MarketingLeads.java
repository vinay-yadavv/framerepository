package com.evs.pageWise;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.evs.genericMethad.GenericMethad;


public class MarketingLeads {
	
	@FindBy(xpath = "//img[@alt='Create Lead...']")
	private WebElement createLeads;
	@FindBy(xpath = "//input[@name='firstname']")
	private WebElement firstName;
	@FindBy(xpath = "//input[@name='lastname']")
	private WebElement lastName;
	@FindBy(xpath = "//input[@name='company']")
	private WebElement company;
	@FindBy(xpath = "//input[@name='email']")
	private WebElement email;
	@FindBy(xpath ="(//input[@title='Save [Alt+S]'])[1]" )
	private WebElement save_bt;
	
public void valid_marketingLeads(GenericMethad gm,String firstname,String lastname,String companyname,String gmailId ) {
		
		gm.click(createLeads);
		gm.sendkeys(firstName,firstname);
		gm.sendkeys(lastName,lastname);
		gm.sendkeys(company,companyname);
		gm.sendkeys(email,gmailId);
		gm.click(save_bt);
		gm.acceptPopup();
		
	}
	public void invalid_marketingLeads() {
		
	}

}
