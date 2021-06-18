package steps;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Actions.CarGuideHomePageActions;
import pages.Actions.UsedCarPageActions;

public class UsedCarSteps {

	CarGuideHomePageActions carGuideHomePageActions = new CarGuideHomePageActions();
	UsedCarPageActions usedCarPageActions = new UsedCarPageActions();

	@When("^click on \"([^\"]*)\" link on Used car page$")
	public void click_on_link_on_Used_car_page(String arg1) throws Throwable {
		
		carGuideHomePageActions.clickonUsed();
	}

	@When("^select carbrand as \"([^\"]*)\" from AnyMake dropdown on Used car page$")
	public void select_carbrand_as_from_AnyMake_dropdown_on_Used_car_page(String carBand) throws Throwable {
		
		usedCarPageActions.selectCarMake(carBand);
	}

	@When("^select car model on Used car page$")
	public void select_car_model_on_Used_car_page(List<String> list) throws Throwable {
		
		String menu = list.get(1);
		System.out.println(menu);
		usedCarPageActions.selectCarModel(menu);
	}

	@When("^select location as \"([^\"]*)\" from SelectLocation dropdown on Used car page$")
	public void select_location_as_from_SelectLocation_dropdown_on_Used_car_page(String carLocation) throws Throwable {
		
		usedCarPageActions.selectCarLocation(carLocation);
		
	}

	@When("^select \"([^\"]*)\" as price on Used car page$")
	public void select_as_price_on_Used_car_page(String carPrice) throws Throwable {
		
		usedCarPageActions.selectCarPrice(carPrice);
		
	}

	@When("^click on Find_My_Next_Car button on Used car page$")
	public void click_on_Find_My_Next_Car_button_on_Used_car_page() throws Throwable {
		
		usedCarPageActions.clickonFindmyNextCar();
	}

	@Then("^I should see list of searched cars on Used car page$")
	public void i_should_see_list_of_searched_cars_on_Used_car_page() throws Throwable {
		
		System.out.println("Used Car list found");
	}

}
