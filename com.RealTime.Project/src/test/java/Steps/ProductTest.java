package Steps;

import ConfigReader.ConfigDataProvider;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import testContext.BaseClass;
import testContext.TestContextUI;

public class ProductTest extends BaseClass {

	TestContextUI testContextUI;
	public ConfigDataProvider config;
	
	
	public ProductTest(TestContextUI testContextUI) {
		this.testContextUI = testContextUI;
	}
	@Given("Click on Product")
	public void click_on_product() {
	  
	}

	@When("Opening the Add Product")
	public void opening_the_add_product() {

	}

	@When("User filling the following information")
	public void user_filling_the_following_information(io.cucumber.datatable.DataTable dataTable) {

	}


}
