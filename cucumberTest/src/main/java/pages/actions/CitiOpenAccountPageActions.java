package pages.actions;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.NoSuchElementException;

import pages.locators.CitiHomePageLocators;
import pages.locators.CitiOpenAccountPageLocators;
import utils.SeleniumDriver;
import org.openqa.selenium.support.ui.Select;

public class CitiOpenAccountPageActions {

	//WebDriver driver=null;
			CitiOpenAccountPageLocators citiOpenAccountPageLocators=null;
			
			//Constructor
			public  CitiOpenAccountPageActions()
			{
				//this.driver=driver;
				this.citiOpenAccountPageLocators = new CitiOpenAccountPageLocators();
				//PageFactory.initElements(SeleniumDriver.getDriver(), citiOpenAccountPageLocators);
				PageFactory.initElements(new AjaxElementLocatorFactory(SeleniumDriver.getDriver(),15), citiOpenAccountPageLocators);
				
			}

			
			//Actions
			public void clickOnCancelOverlayLink()
			{
				System.out.println(">> Overlay cancel button");
				
				System.out.println(">> Object get text =" + citiOpenAccountPageLocators.cancelOverlayButton.getText());
							
				citiOpenAccountPageLocators.cancelOverlayButton.click();
												
			}
			
			public void selectState(int nthState) 
			{
				System.out.println(">> Overlay select state");
				
				//This Pagelocator is NOT working- so need to call directly 
				//citiOpenAccountPageLocators.stateOverlayDropdown.click();
			
				// Click the Select control and open the dropdown			
				//SeleniumDriver.getDriver().findElement(By.xpath("//*[@id=\'RegionalPricingLocation-snapshot-button\']")).click();
				//SeleniumDriver.waitForPageToLoad();
				
				try {
				SeleniumDriver.getDriver().findElement(By.xpath("//*[@id=\'RegionalPricingLocation-snapshot-button\']")).click();
				SeleniumDriver.waitForPageToLoad();
				}
				catch(NoSuchElementException e){
					System.out.println("xxxxxx Exception - state not found");
										
				}
				
			/*try {
				Thread.sleep(500000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			*/
				
				Select stateDropdown=new Select(SeleniumDriver.getDriver().findElement(By.xpath("//*[@id='RegionalPricingLocation-snapshot']")));
			//	Select stateDropdown=new Select(SeleniumDriver.getDriver().findElement(By.name("stateSelected")));
				
				List<WebElement> l = stateDropdown.getOptions();
				System.out.println(">> State list size="+l.size());
			//Following DOESN'T WORK IN THIS CASE - so use the loop to run down the loop and select the state
				//SeleniumDriver.getDriver().findElement(By.linkText("TX")).isSelected();				
				//stateDropdown.selectByVisibleText("TX");
				//stateDropdown.selectByIndex(3);
				//stateDropdown.selectByValue("TX");
				for(int j = 0; j <= nthState; j++){
				    Actions actions = new Actions(SeleniumDriver.getDriver());
				    actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
				    Actions actions1 = new Actions(SeleniumDriver.getDriver());
				    actions1.sendKeys(Keys.ENTER).build().perform();//press enter
				}
							
			}
			
			public void clickOnSelectOverlayLink()
			{
				System.out.println(">> Overlay select button");
				
				System.out.println(">> Object get text =" + citiOpenAccountPageLocators.selectOverlayButton.getText());
							
				citiOpenAccountPageLocators.selectOverlayButton.click();
												
			}
			
			public void clickOnOpenBasicPackageLink()
			{
				//If element not found it was taking time. Added the exception handling to teardown.
				try {
				citiOpenAccountPageLocators.openBasicAccountPackageButton.click();
				} catch (NoSuchElementException e)
				{
					System.out.println("xxxxx Open basic banking package button not found - tear down");
					
				}
			}
			
			
			
}
