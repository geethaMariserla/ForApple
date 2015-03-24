package com.demo.steps;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;

import com.demo.framework.BasePage;
import com.demo.framework.DataSheet;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import com.demo.pages.*;
/*@Component
@ContextConfiguration("classpath:cucumber.xml")
*/
public class task1steps  extends BasePage{
	Task1pages obj = new Task1pages();
	DataSheet dataSheet=new DataSheet();
	
	
	
	@Given("^I launch the home page for \"(.*?)\"$")
	public void i_launch_the_home_page_for(String testCaseName) throws Throwable {
		System.out.println("e1");
		setTestNameRow(testCaseName);
		System.out.println("e2");
		
		
		
		
		
		obj.launchApplication();
		System.out.println("e3");
	}
	
	@When("^I click on signup button$")
	public void i_click_on_signup_button() throws Throwable {
		obj.clickOnSignUp();
	}

	@When("^I enter firstnam lastname email$")
	public void i_enter_firstnam_lastname_email() throws Throwable {
		obj.enterDetails();
		}
	
	@Then("^success message should be displayed after signupbutton is clicked$")
	public void success_message_should_be_displayed() throws Throwable {
		obj.clickOnSubmit();
	
	}
	
	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
	//obj.quitBrowser();  
	}

	
}
