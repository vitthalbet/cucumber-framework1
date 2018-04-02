package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CitiOpenAccountPageLocators {
	
	
	//State drop down on the state overlay h
	@FindBy(how=How.XPATH,using="//*[@id='RegionalPricingLocation-snapshot']")
	public WebElement stateOverlayDropdown;
		
	//Cancel button on the state overlay
	@FindBy(how=How.XPATH,using="//*[@id=\'cmlink_CancelBtn\']")
	public WebElement cancelOverlayButton;
	
	//Select button on the state overlay
	@FindBy(how=How.XPATH,using="//*[@id=\'cmlink_GoBtnLocForm\']")
	public WebElement selectOverlayButton;
	
			
	//Basic banking package
	@FindBy(how=How.XPATH,using=".//*[@class='main-ao']/div[@class='table'][1]/table/tbody/tr[@class='even last']/td[2]/a[@id='cmlink_AOStart']")
	public WebElement openBasicAccountPackageButton;
	
	
}
