package com.parallel.steps;

import static org.testng.Assert.assertTrue;

import com.parallel.pages.GmailPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class GmailSteps {

	private static GmailPage gmailPage;
	
	@Given("I am on Gmail")
	public void iAmOnGmail() {
		gmailPage = new GmailPage(Common.scenarioContext.get());
	    gmailPage.navigate("https://www.gmail.com");
	}
	@Then("the Signin button is present")
	public void theSigninButtonIsPresent() {
	    assertTrue(gmailPage.isSignInButtonPresent(), "Verification of Sign in button");
	}
	
}
