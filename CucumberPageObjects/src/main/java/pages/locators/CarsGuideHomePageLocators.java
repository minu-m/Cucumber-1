package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CarsGuideHomePageLocators {
	
	@FindBy(how=How.LINK_TEXT, using="buy + sell")
	public WebElement buysaleLink;
	
	@FindBy(how=How.LINK_TEXT, using="reviews")
	public WebElement reviewLink;
	
	@FindBy(how=How.LINK_TEXT, using="news")
	public WebElement newsLink;
	
	@FindBy(how=How.LINK_TEXT, using="Search Cars")
	public WebElement searchcarsLink;
	
	@FindBy(how=How.LINK_TEXT, using="Used")
	public WebElement usedLink;
	
	

}
