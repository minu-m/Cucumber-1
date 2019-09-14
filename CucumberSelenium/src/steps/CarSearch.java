package steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Verify;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
//import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CarSearch {
	
	    WebDriver driver;
	    Actions action;
	    
		@Before
		public  void setup(){
			driver = new ChromeDriver();
			action = new Actions(driver);
		}
	
	
	@Given("^I am on the home page of carsguide$")
	public void i_am_on_the_home_page_of_carsguide() throws Throwable {
		
		driver.get("https://www.carsguide.com.au/");
	    
	    
	}

	@When("^I move to buy \\+ sell menu$")
	public void i_move_to_buy_sell_menu() throws Throwable {
		
		
	    action.moveToElement(driver.findElement(By.xpath("//*[@id='u_H']/div/div[1]/ul/li[1]/a"))).perform();
	    
	}

	@Then("^I click on Search Cars$")
	public void i_click_on_Search_Cars() throws Throwable {
		
		driver.findElement(By.xpath("//*[@id='u_H']/div/div[1]/ul/li[1]/div/div/div[1]/ul/li[1]/a")).click();
	    
	    
	}

	@Then("^I select Make as \"(.*?)\"$")
	public void i_select_Make_as(String car_make) throws Throwable {
		
		WebElement make = driver.findElement(By.id("makes"));
		Select select =  new Select(make);
		select.selectByValue(car_make);
	    
	    
	}

	@Then("^I select Model as \"(.*?)\"$")
	public void i_select_Model_as(String car_model) throws Throwable {
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfNestedElementsLocatedBy(By.id("models"), By.tagName("option")));
	    
		WebElement model = driver.findElement(By.id("models"));
		
		Select select =  new Select(model);
		
		
		select.selectByValue(car_model);
	    
	}

	@Then("^I select Location as \"(.*?)\"$")
	public void i_select_Location_as(String car_loc) throws Throwable {
	    
		WebElement location = driver.findElement(By.id("locations"));
		Select select =  new Select(location);
		select.selectByValue(car_loc);
	    
	}

	@Then("^I select Price as \"(.*?)\"$")
	public void i_select_Price_as(String car_price) throws Throwable {
		
		WebElement price = driver.findElement(By.id("price-max"));
		Select select =  new Select(price);
		select.selectByValue(car_price);
	    
	    
	}

	@Then("^I click on Find my new car button$")
	public void i_click_on_Find_my_new_car_button() throws Throwable {
		
		driver.findElement(By.id("search-submit")).click();
	    
	    
	}

	@Then("^I should see list of cars$")
	public void i_should_see_list_of_cars() throws Throwable {
		
		String page_title = driver.findElement(By.xpath("//*[@id='all-tab-content']/div[1]/div[2]/h1")).getText(); 
		//if (page_title != "22 1 Series for Sale under $20,000")

	   
		//Assert.assertEquals("List of cars incorrect",page_title, "22 1 Series for Sale under $20,000");
		
		Verify.verify(false, "List of cars incorrect",page_title, "22 1 Series for Sale under $20,000");	
		
	}

	@Then("^the Title should be \"(.*?)\"$")
	public void the_Title_should_be(String title) throws Throwable {
		
	//	Assert.assertEquals("Title is incorrect",driver.getTitle(), title);
		
		
		
		Verify.verify(true, "Title is incorrect",driver.getTitle(), title);
		}
	    
	    
	

	
	@After
	public void tearDown(Scenario scenario){
		
		if (scenario.isFailed()){
			
			byte[] screenshotBytes = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshotBytes, "image/png");		
			
		}
			
		if (driver!=null)
		driver.quit();
	}

	}




