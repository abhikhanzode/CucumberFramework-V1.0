package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.Interact;

public class LoginLogoutPage extends Interact {

	private WebDriver driver;

	public LoginLogoutPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	//Using FindBy for locating elements
	@FindBy(xpath="//input[@name='identity']") WebElement userName;
	@FindBy(name="password") WebElement passWord;
	@FindBy(xpath="//button[@class='btn btn-primary btn-block btn-flat']") WebElement btnLogin;


	public void LoginModule(String username, String password) throws Exception {
		userName.clear();
		setElement(userName, username);
		passWord.clear();
		setElement(passWord, password);
		Thread.sleep(2000);
		ClickOnElement(btnLogin);
	}


	@FindBy(css ="span[class='hidden-xs']") WebElement loggedUser;
	@FindBy(linkText = "Sign Out") WebElement signOut;



}
