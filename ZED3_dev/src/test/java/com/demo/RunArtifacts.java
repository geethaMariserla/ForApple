package com.demo;


	import cucumber.api.CucumberOptions;
	import cucumber.api.junit.Cucumber;
	
	import org.junit.runner.RunWith;
	

	/**
	 * Triggers all Cucumber tests defined in *.feature files using steps defined in
	 * *.java files.
	 * <p>
	 * These files are loaded from this class' package and its sub-packages.
	 * 
	 */
		
	@RunWith(Cucumber.class)
	
            @CucumberOptions(
			tags={"@run"},
			format = { "pretty", "html:target/cucumber-html",			
			"junit:target/cucumber-junit/report.xml" })
	
	public class RunArtifacts {
		// Runner class
		
	}

	
	
	
	
