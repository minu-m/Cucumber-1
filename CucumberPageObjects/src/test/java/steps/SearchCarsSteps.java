package steps;

import java.util.List;

//import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.CarSearchPageActions;
import pages.actions.CarsGuideHomePageActions;
import utils.SeleniumDriver;

public class SearchCarsSteps {
	
	CarsGuideHomePageActions carsguidehomepageactions = null;
	CarSearchPageActions carsearchpageactions = null;
	
	@Given("^User is on the home page \"([^\"]*)\"$")
	public void user_is_on_the_home_page(String homepage) throws Throwable {
	    
		SeleniumDriver.getDriver().get(homepage);
	    
	}

	@When("^I move to the menu$")
	public void i_move_to_the_menu(List<String> list) throws Throwable {
	    
	   String menu = list.get(1);
	   System.out.println("Menu selected is :" + menu);
	   carsguidehomepageactions.movetoBuySellMenu();
	    
	}

	@When("^click on Search Cars link$")
	public void click_on_Search_Cars_link() throws Throwable {
		carsguidehomepageactions.clickonSearchCarsMenu();
	    
	}

	@When("^select Make as \"([^\"]*)\" from the Any Make dropdown$")
	public void select_Make_as_from_the_Any_Make_dropdown(String CarMake) throws Throwable {
		
		carsearchpageactions.selectCarMake(CarMake);
		
	    
	    
	}

	@When("^select Car Model as \"([^\"]*)\" from the select Model dropdown$")
	public void select_Car_Model_as_from_the_select_Model_dropdown(String CarModel) throws Throwable {
	    
		carsearchpageactions.selectCarModel(CarModel);
	}

	@When("^select Location as \"([^\"]*)\" from the select Location dropdown$")
	public void select_Location_as_from_the_select_Location_dropdown(String CarLoc) throws Throwable {
	    
		carsearchpageactions.selectCarLoc(CarLoc);
	}

	@When("^select Price as \"([^\"]*)\" from the Price dropdown$")
	public void select_Price_as_from_the_Price_Max_dropdown(String CarPrice) throws Throwable {
		
		carsearchpageactions.selectCarPrice(CarPrice);
	    
	    
	}

	@When("^click on the Find My Next Car button$")
	public void click_on_the_Find_My_Next_Car_button() throws Throwable {
	    
		carsearchpageactions.clickonFindCar();
	}

	@Then("^I should see the list of cars$")
	public void i_should_see_the_list_of_cars() throws Throwable {
	    
	    
	}

	@Then("^the page title should be \"([^\"]*)\"$")
	public void the_page_title_should_be(String arg1) throws Throwable {
	    
	    
	}

}
