package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CitiOpenAccountInputPageLocators {
	
	//Title on Input screen 
	@FindBy(how=How.XPATH,using="//*[@id=\"sfc-form\"]/div[22]/div[1]/div/div[1]/div[2]/div[1]/div[2]/div/h1/span")
	public WebElement titleInputScreen;
	
}
