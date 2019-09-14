package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CarSearchPageLocators {
	
	@FindBy(how=How.XPATH, using="//*[@id='makes']")
	public WebElement makeDropdown;
	
	@FindBy(how=How.XPATH, using="//*[@id='models']")
	public WebElement modelsDropdown;
	
	@FindBy(how=How.XPATH, using="//*[@id='locations']")
	public WebElement locDropdown;
	
	@FindBy(how=How.XPATH, using="//*[@id='price-max']")
	public WebElement priceDropdown;
	
	@FindBy(how=How.XPATH, using="//*[@id='search-submit']")
	public WebElement findCarButton;
	
	
	
	

}
