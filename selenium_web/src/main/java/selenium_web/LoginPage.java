package selenium_web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class LoginPage extends Selenium {

	private By usernameField = By.id("a");
	private By passwordField = By.id("b");
	private By loginButton = By.id("c");
	private By errorMessage = By.id("d");
	
}
