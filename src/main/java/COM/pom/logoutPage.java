package COM.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logoutPage {
	
	//Hamburger Icon
	@FindBy (xpath = "//div[@class='bm-burger-button']")
	private WebElement hamburger;
	
	//logout button
	@FindBy (xpath = "//a[@id='logout_sidebar_link']")
	private WebElement logoutBtn;
	
	//Creating method to use The WebElement of LogOut
	public logoutPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//Method for Hamburger
	public void clickHamburger() {
		hamburger.click();
		
	}
	
	//Method for LogOut Button
	public void clicklogOutButton() {
		logoutBtn.click();
		
	}

}
