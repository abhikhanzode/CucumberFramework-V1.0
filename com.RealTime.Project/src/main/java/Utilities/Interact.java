package Utilities;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import testContext.BaseClass;

public class Interact extends BaseClass {

	//getter
	public WebDriver getDriver() {
		return driver;
	}

	//setter
	public void setDriver(WebDriver d) {

		this.driver=d;
	}

	public void ClickOnElement(WebElement webelement) {
		WebDriverWait wait = new WebDriverWait (driver, 60);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(webelement));
		element.click();

	}

	public WebElement setElement(WebElement webelement, String text) {
		WebDriverWait wait = new WebDriverWait (driver, 60);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(webelement));
		element.sendKeys(text);
		return element;
	}
	
	public void elementOverActions(WebElement webelement) {
		Actions builder = new Actions(driver);
		builder.moveToElement(webelement).build().perform();
	}
	
	public void elementOverClickActions(WebElement webelement) {
		Actions builder = new Actions(driver);
		builder.moveToElement(webelement).click().build().perform();
	}
	
	
	
	public static WebDriver SwitchToPopUp() throws Exception {
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> iterator = windows.iterator();
		String ModalWindow = iterator.next();
		driver.switchTo().window(ModalWindow);	
		return driver;
	}
	
	public static WebDriver SwitchToBack() {
		driver.switchTo().defaultContent();
		return driver;
	}


}
