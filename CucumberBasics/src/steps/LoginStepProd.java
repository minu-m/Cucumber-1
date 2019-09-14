package steps;
import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;

public class LoginStepProd {
	
	@And ("^user selects the age category$")
	public void user_selects_the_age_category(DataTable table) throws Throwable {
	
	List<Map<String,String>> data = table.asMaps(String.class, String.class);
	System.out.println("@And -- user selects the age category : " + data.get(0).get("Age") + "--user selects the country --:" +data.get(0).get("Location") );
	
	}
	
}
