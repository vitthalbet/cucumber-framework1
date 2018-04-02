package utils;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public class SeleniumHelper {
	
	//by web element
    public static boolean isElementPresent(WebElement webElement) {
        try {
            System.out.println(">>SeleniumHelper web helper WebElement=" + webElement.getText());
        	boolean isPresent = webElement.isDisplayed();
           
            return isPresent;
        } catch (NoSuchElementException e) {
            return false;
        }
        
    }
    
    //by xPath
    public static boolean isElementPresent(String xPath) {
        try {
            System.out.println(">>SeleniumHelper web helper Xpath=" + xPath);            
        	boolean isPresent = !SeleniumDriver.getDriver().findElements(By.xpath(xPath)).isEmpty();
            System.out.println(xPath+" isPresent?=" + isPresent);
            return isPresent;
        } catch (NoSuchElementException e) {
            return false;
        }
        
       
        
    }
}
