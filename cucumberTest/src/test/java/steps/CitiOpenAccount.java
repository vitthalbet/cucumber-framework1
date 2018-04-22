package steps;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
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

public class CitiOpenAccount {
	
	//SeleniumHelper seleniumHelper =new SeleniumHelper();
	CitiHomePageActions citiHomePageActions = new CitiHomePageActions();
	//CitiOpenAccountPageLocators citiOpenAccountPageLocators = new CitiOpenAccountPageLocators();
	CitiOpenAccountPageActions citiOpenAccountPageActions= new CitiOpenAccountPageActions();
	//CitiOpenAccountInputPageLocators citiOpenAccountInputPageLocators= new CitiOpenAccountInputPageLocators();
	
		
	@Given("^I am on the Home Page \"([^\"]*)\" of Citibank website$")
	public void i_am_on_the_Home_Page_of_Citibank_website(String webSiteURL) {
		System.out.println(">>> Opening the home page");
		SeleniumDriver.openPage(webSiteURL);
	}

	@When("^I move to Open an Account Option")
	public void i_move_to_Open_Account_Option() {
		System.out.println(">>> Selecting open account option");
		//SeleniumDriver.waitForPageToLoad();
		citiHomePageActions.clickOnOpenAccountLink();
	}
	
	@And("^click on Basic Banking Package Apply now link$")
	public void click_on_Apply_now_link() {
		
		
		//SeleniumDriver.waitForPageToLoad();
		// If the state selection popup comes up cancel the same and continue with rest of thr flow.
		if(SeleniumHelper.isElementPresent("//*[@id=\'cmlink_CancelBtn\']"))
		{
			// System.out.println(">>> Clicking the cancel button on state overlay"); 
			//citiOpenAccountPageActions.clickOnCancelOverlayLink();
			System.out.println(">> Selecting 7th state");
			citiOpenAccountPageActions.selectState(7);
			citiOpenAccountPageActions.clickOnSelectOverlayLink();
			
		}else
		{
			System.out.println("State overlay not present");
		}
		
		System.out.println(">>> Selecting basic package link ");
		try {
		citiOpenAccountPageActions.clickOnOpenBasicPackageLink();
		}
		catch(NoSuchElementException e) {
			SeleniumDriver.tearDown();
		}
	  		
	}

	@Then("^I should see page title as \"([^\"]*)\"$")
	public void i_should_see_page_title_as(String expectedPageTitle) throws Throwable {
	   
		System.out.print(">>> Reaching banking package page"); 
		   // String ActualPageTitle= citiOpenAccountInputPageLocators.titleInputScreen.getText();
		
		String ActualPageTitle= SeleniumDriver.getDriver().findElement(By.xpath("//*[@id=\'sfc-form\']/div[22]/div[1]/div/div[1]/div[2]/div[1]/div[2]/div/h1/span")).getText(); 
		    System.out.println("Actual page title-->"+ ActualPageTitle);
		    System.out.println("Expected page title-->"+ expectedPageTitle);
		    Assert.assertEquals(expectedPageTitle, ActualPageTitle);
	}


	
}
