package steps;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.CitiHomePageActions;
import pages.actions.CitiHomePageActions;
import pages.actions.CitiOpenAccountPageActions;
import pages.locators.CitiOpenAccountInputPageLocators;
import pages.locators.CitiOpenAccountPageLocators;
import utils.SeleniumDriver;
import utils.SeleniumHelper;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class CitiOpenMortgageAccount {
	
	//SeleniumHelper seleniumHelper =new SeleniumHelper();
	CitiHomePageActions citiHomePageActions = new CitiHomePageActions();
	
		
	// Note the following step definition is already coded in CitiOpenAccount.java - NO NEED to code again
	// it's RE-USE of step definition by keeping the step exactly same
	/*
	 @Given("^I am on the Home Page \"([^\"]*)\" of Citibank website$")
	public void i_am_on_the_Home_Page_of_Citibank_website(String webSiteURL) {
		System.out.println(">>> Opening the home page");
		SeleniumDriver.openPage(webSiteURL);
	}
	*/
	

	
	@When("^I move to Lending Option$")
	public void i_move_to_Lending_Option() {
	   System.out.println(">>>Selecting Lending option");
	 //  SeleniumDriver.waitForPageToLoad();
	   citiHomePageActions.clickOnLendingLink();
	}
	
	@And("^click on Mortgage option$")
	public void click_on_Mortgage_option() {
	    System.out.println(">>>Selecting mortgage option");
	   // SeleniumDriver.waitForPageToLoad();
	    citiHomePageActions.clickOnMortgageLink();
	}
	
	@Then("^I should see page title1 as \"([^\"]*)\"$")
	public void i_should_see_page_title1_as(String expectedPageTitle) throws Throwable {
	   
		System.out.print(">>> Reaching Mortgage page"); 
		   
		String ActualPageTitle= SeleniumDriver.getDriver().findElement(By.xpath("//*[@id=\"homepage-hero\"]/div/div[1]/h1")).getText(); 
		    System.out.println("Actual page title-->"+ ActualPageTitle);
		    System.out.println("Expected page title-->"+ expectedPageTitle);
		    Assert.assertEquals(expectedPageTitle, ActualPageTitle);
		    		  
	}

}
