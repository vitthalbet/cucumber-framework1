package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CitiHomePageLocators {
	
	@FindBy(how=How.LINK_TEXT,using="Open an Account")
	//@FindBy(how=How.XPATH,using="/html/body/header/div[1]/div/div/ul/li[1]/a")
	public WebElement openAnAccountLink;
	
		
}
