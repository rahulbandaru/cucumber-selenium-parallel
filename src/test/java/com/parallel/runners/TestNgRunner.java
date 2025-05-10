package com.parallel.runners;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(glue = "com.parallel.steps", 
		features = "src/main/resources/features/test.feature", 
		plugin = {
				"pretty", 
				"summary",
				"html:target/reports/cucumber-pretty.html",
				"json:target/reports/cucumberTestReport.json" },
		snippets = SnippetType.CAMELCASE,
		dryRun = false)
public class TestNgRunner extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();
	}

}
