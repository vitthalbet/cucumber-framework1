package pages.actions;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pages.locators.CitiHomePageLocators;
import pages.locators.CitiOpenAccountInputPageLocators;
import pages.locators.CitiOpenAccountPageLocators;
import utils.SeleniumDriver;

public class CitiOpenAccountInputPageActions {

	//WebDriver driver=null;
			CitiOpenAccountInputPageLocators citiOpenAccountInputPageLocators=null;
			
			//Constructor
			public  CitiOpenAccountInputPageActions()
			{
				//this.driver=driver;
				this.citiOpenAccountInputPageLocators = new CitiOpenAccountInputPageLocators();
				PageFactory.initElements(SeleniumDriver.getDriver(), citiOpenAccountInputPageLocators);
			}

			
			//Actions
			public void compareInputTitle()
			{
								
															
			}
						
			
}
