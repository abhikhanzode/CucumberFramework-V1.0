package testContext;

import org.openqa.selenium.WebDriver;

import Pages.LoginLogoutPage;
import Pages.ProductPage;

public class TestContextUI extends BaseClass {
	LoginLogoutPage loginLogoutpage;
	ProductPage productPage;

	public WebDriver getDriver() {
		return driver;
	}
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}	
	

	public LoginLogoutPage getLoginLogout() {
		return loginLogoutpage;
	}
	
	public ProductPage GetProductPage() {
		return productPage;
	}
	
	
	public void initializePageObjectClasses(WebDriver driver) {
		loginLogoutpage = new LoginLogoutPage(driver);
		productPage = new ProductPage();
	}
}
