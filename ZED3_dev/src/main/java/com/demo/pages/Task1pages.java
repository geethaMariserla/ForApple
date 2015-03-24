package com.demo.pages;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import jxl.read.biff.BiffException;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.demo.UiMap.UiMap;
import com.demo.framework.*;

import cucumber.api.junit.Cucumber;

public class Task1pages extends BasePage{
	//DataSheet dataSheet  = new DataSheet();
	
	ZED3ExcelOperations excelOp1=new ZED3ExcelOperations();
public void launchApplication() throws IOException
{
	
	/*driver = new FirefoxDriver();
	driver.manage().deleteAllCookies();
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    driver.manage().window().maximize();
	 driver.get("file:///C:/developApp/homepage.html");
	 //Comment for github
*/    
    
}

public void clickOnSignUp() throws IOException, InterruptedException
{
	driver.findElement(By.xpath(UiMap.SignUp)).click();
	Thread.sleep(2000);

}

public void enterDetails() throws BiffException, IOException
{
	//dataSheet.fillSignupdata();
	driver.findElement(By.xpath(UiMap.Fname)).sendKeys(getTestData("FirstName"));
	driver.findElement(By.xpath(UiMap.Lname)).sendKeys(getTestData("LastName"));
	driver.findElement(By.xpath(UiMap.Email)).sendKeys(generateTimeStamp()+"@zed3.com");
	driver.findElement(By.xpath(UiMap.Password)).sendKeys(getTestData("Password"));
	driver.findElement(By.xpath(UiMap.ConfirmPwd)).sendKeys(getTestData("ConfirmPassword"));

}

public void clickOnSubmit() throws IOException
{
	String name = new Object(){}.getClass().getEnclosingMethod().getName();
	this.getScreenshot(name);
	driver.findElement(By.xpath(UiMap.Submit)).click(); 
	if(driver.findElement(By.xpath(UiMap.SuccessMsg)).isDisplayed())
	{
	System.out.println("Success message has been displaayed");	
	}
	else
       {
	         System.out.println("success message has not been displayed");
       }

	
}

    public void quitBrowser(){
    	driver.quit();
    }

	
	
	
}

