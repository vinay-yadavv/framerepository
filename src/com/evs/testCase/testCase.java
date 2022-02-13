package com.evs.testCase;

import org.openqa.selenium.support.PageFactory;
import com.evs.genericMethad.GenericMethad;
import com.evs.pageWise.LoginPg;

public class testCase {
	public static void main(String[] args) {
		GenericMethad gm = new GenericMethad();
		gm.launchBrowser();
		gm.openUrl("http://localhost:8888/");
		LoginPg Login_pg = PageFactory.initElements(gm.getDriver(), LoginPg.class);
		Login_pg.validLoginPage(gm, "admin", "admin");
		
	}

}

