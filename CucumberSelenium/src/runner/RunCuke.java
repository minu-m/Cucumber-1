package runner;
import java.io.File;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.ExtentCucumberFormatter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/features"},
				  glue={"steps"},
				  monochrome=true,				  
				  plugin={"pretty","html:target/cucumber","com.cucumber.listener.ExtentCucumberFormatter"}
				  )
public class RunCuke {

	@BeforeClass
	public static void setup(){
		ExtentCucumberFormatter.initiateExtentCucumberFormatter();
		ExtentCucumberFormatter.loadConfig(new File("src/extent-config.xml"));
		ExtentCucumberFormatter.addSystemInfo("Browser Name", "Chrome");
		ExtentCucumberFormatter.addSystemInfo("Browser version", "v72.0.3626.121");
		
		
	}

	
}
