package pages.Actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.locators.SearchCarsPageLocators;
import utiles.SeleniumDriver;
import utiles.SeleniumHelper;

public class SearchCarsPageActions {

	//SearchCarsPageLocators searchCarsPageLocators = new SearchCarsPageLocators();
	SearchCarsPageLocators searchCarsPageLocators = null;
	SeleniumHelper element = new SeleniumHelper();

	public SearchCarsPageActions() {

		this.searchCarsPageLocators = new SearchCarsPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), searchCarsPageLocators);
	}

	public void selectCarMake(String carBrand) {
		
		element.isElementPresent(searchCarsPageLocators.selectCarAnyMakedropdown);
		Select select = new Select(searchCarsPageLocators.selectCarAnyMakedropdown);
		select.selectByVisibleText(carBrand);
	}

	public void selectCarModel(String carMode) {
		
		element.isElementPresent(searchCarsPageLocators.selectcarAnyModeldropdown);
		Select select = new Select(searchCarsPageLocators.selectcarAnyModeldropdown);
		select.selectByVisibleText(carMode);
	}

	public void selectCarLocation(String carLocation) {

		element.isElementPresent(searchCarsPageLocators.selectCarAnyLocationdropdown);
		Select select = new Select(searchCarsPageLocators.selectCarAnyLocationdropdown);
		select.selectByVisibleText(carLocation);
	}

	public void selectCarPrice(String carPrice) {
		
		element.isElementPresent(searchCarsPageLocators.selectCarPricedropdown);
		Select select = new Select(searchCarsPageLocators.selectCarPricedropdown);
		select.selectByVisibleText(carPrice);
	}
	
	public void clickonFindmyNextCar() {
		
		element.isElementPresent(searchCarsPageLocators.findMyNextCar);
		searchCarsPageLocators.findMyNextCar.click();
	}

}
