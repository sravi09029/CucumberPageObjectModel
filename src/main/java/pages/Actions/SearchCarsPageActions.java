package pages.Actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.locators.SearchCarsPageLocators;
import utiles.SeleniumDriver;

public class SearchCarsPageActions {

	//SearchCarsPageLocators searchCarsPageLocators = new SearchCarsPageLocators();
	SearchCarsPageLocators searchCarsPageLocators = null;

	public SearchCarsPageActions() {

		this.searchCarsPageLocators = new SearchCarsPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), searchCarsPageLocators);
	}

	public void selectCarMake(String carBrand) {

		Select select = new Select(searchCarsPageLocators.selectCarAnyMakedropdown);
		select.selectByVisibleText(carBrand);
	}

	public void selectCarModel(String carMode) {

		Select select = new Select(searchCarsPageLocators.selectcarAnyModeldropdown);
		select.selectByVisibleText(carMode);
	}

	public void selectCarLocation(String carLocation) {

		Select select = new Select(searchCarsPageLocators.selectCarAnyLocationdropdown);
		select.selectByVisibleText(carLocation);
	}

	public void selectCarPrice(String carPrice) {

		Select select = new Select(searchCarsPageLocators.selectCarPricedropdown);
		select.selectByVisibleText(carPrice);
	}
	
	public void clickonFindmyNextCar() {
		
		searchCarsPageLocators.findMyNextCar.click();
	}

}
