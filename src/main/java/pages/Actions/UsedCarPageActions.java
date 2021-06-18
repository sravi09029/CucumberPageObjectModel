package pages.Actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.locators.UsedCarPageLocators;
import utiles.SeleniumDriver;

public class UsedCarPageActions {
	
	UsedCarPageLocators usedCarPageLocators = null;
	
	public UsedCarPageActions() {
		
		this.usedCarPageLocators = new UsedCarPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), usedCarPageLocators);
	}
	
	public void selectCarMake(String carBrand) {

		Select select = new Select(usedCarPageLocators.selectCarAnyMakedropdown);
		select.selectByVisibleText(carBrand);
	}

	public void selectCarModel(String carMode) {

		Select select = new Select(usedCarPageLocators.selectcarAnyModeldropdown);
		select.selectByVisibleText(carMode);
	}

	public void selectCarLocation(String carLocation) {

		Select select = new Select(usedCarPageLocators.selectCarAnyLocationdropdown);
		select.selectByVisibleText(carLocation);
	}

	public void selectCarPrice(String carPrice) {

		Select select = new Select(usedCarPageLocators.selectCarPricedropdown);
		select.selectByVisibleText(carPrice);
	}
	
	public void clickonFindmyNextCar() {
		
		usedCarPageLocators.findMyNextCar.click();
	}
}
