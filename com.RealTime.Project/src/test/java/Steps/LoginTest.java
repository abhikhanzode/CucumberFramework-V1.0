package Steps;

import java.util.concurrent.TimeUnit;

import ConfigReader.ConfigDataProvider;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import testContext.BaseClass;
import testContext.TestContextUI;

public class LoginTest extends BaseClass  {
	TestContextUI testContextUI;
	public ConfigDataProvider config;


	public LoginTest(TestContextUI testContextUI) {
		this.testContextUI = testContextUI;
	}


	@Given("User Launching the Application")
	public void user_launching_the_application() {
		config = new ConfigDataProvider();
		driver.get(config.getStagingURL());
		testContextUI.setDriver(driver);
		testContextUI.initializePageObjectClasses(driver);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

	}

	@When("User Login the Application")
	public void user_login_the_application() throws Exception {
		testContextUI.getLoginLogout().LoginModule(config.getUsername(), config.getPassword());
	}

	@Then("User successfully on the Home Page")
	public void user_successfully_on_the_home_page() {
		System.out.println("HomePage");
	}


	@Then("Logout the Application")
	public void logout_the_application() {
		System.out.println("Logout Done");

	}
}
