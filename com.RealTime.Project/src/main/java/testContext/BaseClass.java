package testContext;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;


	public static WebDriver BrowserFactory(String BrowserName) {


		if (BrowserName.equals("Chrome")) {

			ChromeOptions options = new ChromeOptions();
			options.addArguments("--lang=en");

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(options);

			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();

		}
		else if (BrowserName.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
		}

		else {
			System.out.println("Driver not Supported...! ");
		}

		return driver;
	}

	public static WebDriver TakeScreenShot(Scenario scenario) {
		try {
			String screenshotName = scenario.getName().replaceAll(" ", "_");
			if(scenario.isFailed()) {
				scenario.log("this is my failure message");
				TakesScreenshot ts = (TakesScreenshot) driver;
				byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
				scenario.attach(screenshot, "image/png", screenshotName);

			}

		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return driver;
	}

	public static WebDriver tearDown() {
		if (driver != null) {
			driver.close();
		}
		return driver;
	}




}
