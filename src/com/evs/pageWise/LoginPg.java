package com.evs.pageWise;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.evs.genericMethad.GenericMethad;

public class LoginPg {
	
	@FindBy(xpath ="//input[@name='user_name']" )
	private WebElement user_txt;
	@FindBy(xpath = "//input[@name='user_password']")
	private WebElement pws_txt;
	@FindBy(xpath ="//input[@title='Login [Alt+L]']")
	private WebElement golin_bt;
	
	public HomePg validLoginPage(GenericMethad gm,String username,String password) {

		gm.sendkeys(user_txt,username);
		gm.sendkeys(pws_txt, password);
		gm.click(golin_bt);
		HomePg home_Pg=PageFactory.initElements(gm.getDriver(),HomePg.class);
		home_Pg.validHomePage(gm);
		return home_Pg;
	}

	public void invalidLoginPage() {

	}

}
