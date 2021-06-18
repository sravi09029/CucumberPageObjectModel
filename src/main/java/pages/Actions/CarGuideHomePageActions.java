package pages.Actions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import pages.locators.CarGuideHomePageLocators;
import utiles.SeleniumDriver;

public class CarGuideHomePageActions {

	//CarGuideHomePageLocators carGuideHomePageLocators = new CarGuideHomePageLocators();
	CarGuideHomePageLocators carGuideHomePageLocators = null;

	public CarGuideHomePageActions() {

		this.carGuideHomePageLocators = new CarGuideHomePageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), carGuideHomePageLocators);
	}

	public void moveTobuySell() {

		Actions action = new Actions(SeleniumDriver.getDriver());
		action.moveToElement(carGuideHomePageLocators.BuySellLink).perform();
	}

	public void clickonSearchCars() {

		carGuideHomePageLocators.SearchCarsLink.click();
	}

	public void clickonUsed() {
		
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
