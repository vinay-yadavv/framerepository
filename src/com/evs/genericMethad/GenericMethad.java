package com.evs.genericMethad;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class GenericMethad {
	private	WebDriver driver;
	GenericMethad gm;
	
	public WebDriver getDriver() {
		return driver;
	}

	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	public void openUrl(String url) {
		driver.get(url);
	}

	public WebElement getElement(String xpath) {
		WebElement element = driver.findElement(By.xpath(xpath));
		return element;
	}

	public void close() {
		driver.close();
	}

	public void sendkeys(WebElement we, String value) {
		we.sendKeys(value);

	}

	public void click(WebElement we) {
		we.click();
	}

	public void dropDoun1(WebElement we, int number) {
		Select sle = new Select(we);
		sle.selectByIndex(number);
	}

	public void dropDoun2(WebElement we, String valueAtr) {
		Select sle = new Select(we);
		sle.selectByValue(valueAtr);
	}

	public void dropDoun3(WebElement we, String innarText) {
		Select sle = new Select(we);
		sle.selectByVisibleText(innarText);
	}

	public void dragAndDrop(WebElement args1, WebElement args2) {
		Actions act = new Actions(driver);

	}

	public void mouseover(WebElement target) {
		Actions act = new Actions(driver);
		act.moveToElement(target).build().perform();
		;
	}

	public void dishmissPopup() {
		driver.switchTo().alert().dismiss();
	}

	public void acceptPopup() {
		driver.switchTo().alert().accept();
	}

}
