package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStep {

	@Before
	public void setUp(){
		
		System.out.println("Browser is Launched");
	}
	
	@After
	public void tearDown(){
		
		System.out.println("driver.quit()");
	}
	
	@Given("^user navigates to facebook page$")
	public void user_navigates_to_facebook_page() throws Throwable {
	    
		System.out.println("@Given -user navigates to facebook page ");
	}

	@When("^user validates the homepage title$")
	public void user_validates_the_homepage_title() throws Throwable {
		
		System.out.println("@When - user validates the homepage title");
	  
	}

	@Then("^user enters \"([a-zA-Z]{1,})\" user id$")
	public void user_enters_the_user_id(String userid) throws Throwable {
		
		System.out.println("@Then - user enters the "+userid+" user id");
	    
	}

	@And("^user enters \"([a-zA-Z]{1,})\" password$")
	public void user_enters_the_password(String pwd) throws Throwable {
		
		System.out.println("@And - user enters the "+pwd+" password");
	    
	}

	@Then("^user should \"([a-zA-Z]{1,})\" succesfully login$")
	public void user_should_succesfully_login(String login) throws Throwable {
	    
		System.out.println("@Then - user should "+login+" succesfully login");
	}


}
