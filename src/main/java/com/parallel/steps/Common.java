package com.parallel.steps;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Common {

	public static ThreadLocal<WebDriver> scenarioContext = new ThreadLocal<>();

	@Before
	public void setUp(Scenario scenario) throws MalformedURLException {
		WebDriver driver = new ChromeDriver();
		System.out.println("Starting new driver for scenario: " + scenario.getName());
		System.out.println("Driver instance: " + driver.hashCode());
		scenarioContext.set(driver);
	}

	@After
	public void teardown(Scenario scenario) throws Exception {
		Thread.sleep(1_000);
		scenarioContext.get().quit();
	}

}
