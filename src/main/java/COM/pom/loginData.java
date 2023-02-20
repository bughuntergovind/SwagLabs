package COM.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginData {
	
	//username
	@FindBy (xpath = "//input[@id='user-name']")
	private WebElement username;
	
	//password
	@FindBy (xpath = "//input[@id='password']")
	private WebElement password;
	
	//Login Button
	@FindBy (xpath = "//input[@id='login-button']")
	private WebElement loginBtn;
	
	
	
	//Creating Constructor TO initialize The WebElement
	
	public loginData(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	
	//Creating method to use The WebElement 
	//username
	
	public void usernameData(String pass) {
		username.sendKeys(pass);
	}
	
	//password
	public void passwordData(String pass) {
		password.sendKeys(pass);
	}
	
	//login button
	public void loginButton() {
		loginBtn.click();
		
	}
	

}
