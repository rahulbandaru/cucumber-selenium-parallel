package com.parallel.steps;

import static org.testng.Assert.assertTrue;

import com.parallel.pages.GooglePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class GoogleSteps {

	private static GooglePage googlePage;
	
	@Given("I am on Google")
	public void iAmOnGoogle() {
		googlePage = new GooglePage(Common.scenarioContext.get());
	    googlePage.navigate("https://www.google.com");
	}
	@Then("the search button is present")
	public void theSearchButtonIsPresent() {
		assertTrue(googlePage.isSearchButtonPresent(), "Verification of Search button");
	}
	
}
