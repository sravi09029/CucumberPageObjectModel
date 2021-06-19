package pages.Actions;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import pages.locators.CarGuideHomePageLocators;
import utiles.SeleniumDriver;
import utiles.SeleniumHelper;


public class CarGuideHomePageActions {

	//CarGuideHomePageLocators carGuideHomePageLocators = new CarGuideHomePageLocators();
	CarGuideHomePageLocators carGuideHomePageLocators = null;
	SeleniumHelper element = new SeleniumHelper();

	public CarGuideHomePageActions() {
		
		this.carGuideHomePageLocators = new CarGuideHomePageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), carGuideHomePageLocators);
	}

	public void moveTobuySell() {
		
		element.isElementPresent(carGuideHomePageLocators.BuySellLink);
		Actions action = new Actions(SeleniumDriver.getDriver());
		action.moveToElement(carGuideHomePageLocators.BuySellLink).perform();
	}

	public void clickonSearchCars() {
		
		element.isElementPresent(carGuideHomePageLocators.SearchCarsLink);
		carGuideHomePageLocators.SearchCarsLink.click();
	}

	public void clickonUsed() {
		
		element.isElementPresent(carGuideHomePageLocators.UsedLink);
		carGuideHomePageLocators.UsedLink.click();
	}

	public void clickonNew() {
		

	}

	public void clickonFindMycar() {
		

	}

	public void clickonWhatcarShouldBy() {
		

	}

	public void clickonSellMyCar() {
		

	}

	public void clickonManageMyAd() {
		
		

	}

	public void clickonCarSellingTip() {

	}
	
    public void moveTOreviews() {
    	
    	
    }
}
