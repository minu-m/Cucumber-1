package runners;

import java.io.File;

import org.testng.annotations.BeforeClass;

import com.cucumber.listener.ExtentCucumberFormatter;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(	
		
		plugin = {"json:target/RunCuke/cucumber.json", 
				"pretty", "html:target/RunCuke/cucumber.html", "com.cucumber.listener.ExtentCucumberFormatter"},
					
		features = {"src/test/resources/features"},
		glue ={"steps"},
		tags = {"search-cars"}
		
		)

public class RunCuke extends AbstractTestNGCucumberTests {
	
	@BeforeClass
	public static void setup(){
		ExtentCucumberFormatter.initiateExtentCucumberFormatter();
		ExtentCucumberFormatter.loadConfig(new File("target/extent-config.xml"));
		ExtentCucumberFormatter.addSystemInfo("Browser Name", "Chrome");
		ExtentCucumberFormatter.addSystemInfo("Browser version", "v72.0.3626.121");

	}

}
