package pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.locators.CarSearchPageLocators;
import utils.SeleniumDriver;

public class CarSearchPageActions {
	
	CarSearchPageLocators carsearchpagelocators = null;
	
	public CarSearchPageActions(){
		
		this.carsearchpagelocators = new CarSearchPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(),carsearchpagelocators);
	}
	
	
	public void selectCarMake(String CarMake){
		
		Select select = new Select(carsearchpagelocators.makeDropdown);
		select.selectByVisibleText(CarMake);
	}
	
	public void selectCarModel(String CarModel){
		
		Select select = new Select(carsearchpagelocators.modelsDropdown);
		select.selectByVisibleText(CarModel);
	}

	public void selectCarLoc(String CarLoc){
	
	Select select = new Select(carsearchpagelocators.locDropdown);
	select.selectByVisibleText(CarLoc);
}

	public void selectCarPrice(String CarPrice){
	
	Select select = new Select(carsearchpagelocators.priceDropdown);
	select.selectByVisibleText(CarPrice);
}
	
	public void clickonFindCar(){
		
		carsearchpagelocators.findCarButton.click();
	}

}
