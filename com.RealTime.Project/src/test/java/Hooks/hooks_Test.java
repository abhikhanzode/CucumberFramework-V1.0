package Hooks;

import ConfigReader.ConfigDataProvider;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import testContext.BaseClass;

public class hooks_Test {

	public ConfigDataProvider config;

	@Before("@Test")
	public void setDriver() {
		config = new ConfigDataProvider();
		BaseClass.BrowserFactory(config.getBrowser());
	}


	@After("@Test")
	public void tearDownDriver(Scenario scenario) {
		BaseClass.TakeScreenShot(scenario);
	}

}
