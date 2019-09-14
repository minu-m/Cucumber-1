package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumDriver {

	private static SeleniumDriver seleniumdriver;
	private static WebDriver driver;
	private static WebDriverWait wait;
	public final static int TIMEOUT=30;
	public final static int PAGE_LOAD_TIMEOUT=60;
	
	private SeleniumDriver(){
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver,TIMEOUT);
		
		driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		
	}
	
	public static void openPage(String url){
		
		driver.get(url);
	}
	
	public static WebDriver getDriver(){
		
		return driver;
	}
	
	public static void setUpDriver(){
		
		if(seleniumdriver==null){
			
			seleniumdriver = new SeleniumDriver();
		}
	}
	
	public static void tearDown(){
		
		if(driver!=null){
		
			driver.close();
			driver.quit();
		}
		
		seleniumdriver=null;
		
	}
	
	
}


