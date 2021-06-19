package steps;

import java.util.List;

import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Actions.CarGuideHomePageActions;
import pages.Actions.SearchCarsPageActions;
import utiles.SeleniumDriver;

public class SearchcarSteps {
	
	CarGuideHomePageActions carGuideHomePageActions = new CarGuideHomePageActions();
	SearchCarsPageActions searchCarsPageActions = new SearchCarsPageActions();
	
	
	@Given("^I am on the Home Page \"([^\"]*)\" of CarsGuide Website$")
	public void i_am_on_the_Home_Page_of_CarsGuide_Website(String webSiteURL) throws Throwable {
		
		SeleniumDriver.openPage(webSiteURL);
	}

	@When("^I move to Car For Sale Menu$")
	public void i_move_to_Car_For_Sale_Menu(List<String> list) throws Throwable {
		
	   String menu = list.get(1);
	   System.out.println("Menu selected is: "+menu);
	   carGuideHomePageActions.moveTobuySell();
	   
	}

	@When("^click on \"([^\"]*)\" link$")
	public void click_on_link(String searchcar) throws Throwable {
		
		carGuideHomePageActions.clickonSearchCars();
	    
	}

	@When("^select carbrand as \"([^\"]*)\" from AnyMake dropdown$")
	public void select_carbrand_as_from_AnyMake_dropdown(String carMake) throws Throwable {
		
		searchCarsPageActions.selectCarMake(carMake);
	}

	@When("^select \"([^\"]*)\" as car model$")
	public void select_as_car_model(String carMode) throws Throwable {
	  
		searchCarsPageActions.selectCarModel(carMode);
	}

	@When("^select location as \"([^\"]*)\" from SelectLocation dropdown$")
	public void select_location_as_from_SelectLocation_dropdown(String carLocation) throws Throwable {
	 
		searchCarsPageActions.selectCarLocation(carLocation);
	}

	@When("^select \"([^\"]*)\" as price$")
	public void select_as_price(String carPrice) throws Throwable {
	    
		searchCarsPageActions.selectCarPrice(carPrice);
	}

	@When("^click on Find_My_Next_Car button$")
	public void click_on_Find_My_Next_Car_button() throws Throwable {
	   
		searchCarsPageActions.clickonFindmyNextCar();
	}

	@Then("^I should see list of searched cars$")
	public void i_should_see_list_of_searched_cars() throws Throwable {
		
	    System.out.println("Car list found");
	}

	@Then("^the page title should be \"([^\"]*)\"$")
	public void the_page_title_should_be(String expected_title) throws Throwable {
		
		String actual_title = SeleniumDriver.getDriver().getTitle();
		Assert.assertEquals(actual_title, expected_title);
	    
	}

}
