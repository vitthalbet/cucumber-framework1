package pages.actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;

import pages.locators.CitiHomePageLocators;
import utils.SeleniumDriver;

public class CitiHomePageActions {
	
	//WebDriver driver=null;
		CitiHomePageLocators citiHomePageLocators=null;
		
		
		//Constructor
		public  CitiHomePageActions()
		{
			//this.driver=driver;
			this.citiHomePageLocators = new CitiHomePageLocators();
			//PageFactory.initElements(SeleniumDriver.getDriver(), citiHomePageLocators);
			PageFactory.initElements(new AjaxElementLocatorFactory(SeleniumDriver.getDriver(),15), citiHomePageLocators);
				
		}

		
		public void clickOnOpenAccountLink()
		{
			citiHomePageLocators.openAnAccountLink.click();
			
		}

		public void clickOnLendingLink()
		{
			citiHomePageLocators.lendingLink.click();			
		}
		
		public void clickOnMortgageLink()
		{
			citiHomePageLocators.mortgageLink.click();			
		}
		
		
}
