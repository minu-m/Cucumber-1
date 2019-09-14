package steps;

import cucumber.api.java.Before;
import utils.SeleniumDriver;


public class BeforeSetup {

@Before	
	public static void setUp(){
		
		SeleniumDriver.setUpDriver();
	}

}
