package com.parallel.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GooglePage {

	private WebDriver driver;

    public GooglePage(WebDriver driver) {
        this.driver = driver;
    }
    
    public boolean navigate(String url) {
    	driver.get(url);
    	return driver.getTitle().contentEquals("Google");
    }

	public boolean isSearchButtonPresent() {
		return driver.findElement(By.name("q")).isDisplayed();
	}
    
}
