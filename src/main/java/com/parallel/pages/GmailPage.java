package com.parallel.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GmailPage {

	private WebDriver driver;

    public GmailPage(WebDriver driver) {
        this.driver = driver;
    }
    
    public boolean navigate(String url) {
    	driver.get(url);
    	return driver.getTitle().contentEquals("Gmail");
    }

	public boolean isSignInButtonPresent() {
		return driver.findElement(By.name("identifier")).isDisplayed();
	}
    
}
