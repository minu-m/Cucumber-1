package pages.actions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import pages.locators.CarsGuideHomePageLocators;
import utils.SeleniumDriver;

public class CarsGuideHomePageActions {
	
	CarsGuideHomePageLocators carsguidehomepagelocators = null;
	
	public CarsGuideHomePageActions(){
		
		this.carsguidehomepagelocators = new CarsGuideHomePageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), carsguidehomepagelocators);
		
		}
	
	public void movetoBuySellMenu(){
		
		Actions action = new Actions(SeleniumDriver.getDriver());
		action.moveToElement(carsguidehomepagelocators.buysaleLink).perform();
		
		
	}
	
	public void movetoReviewMenu(){
		
		Actions action = new Actions(SeleniumDriver.getDriver());
		action.moveToElement(carsguidehomepagelocators.reviewLink).perform();
		
		
	}
	
	public void movetoNewsMenu(){
		
		Actions action = new Actions(SeleniumDriver.getDriver());
		action.moveToElement(carsguidehomepagelocators.newsLink).perform();
		
		
	}
	
	public void clickonSearchCarsMenu(){
		
		//Actions action = new Actions(SeleniumDriver.getDriver());
		//action.moveToElement(carsguidehomepagelocators.buysaleLink).perform();
		carsguidehomepagelocators.searchcarsLink.click();
		
	}
	
	public void clickonUsedMenu(){
		
		Actions action = new Actions(SeleniumDriver.getDriver());
		action.moveToElement(carsguidehomepagelocators.buysaleLink).perform();
		carsguidehomepagelocators.usedLink.click();
		
	}
}
