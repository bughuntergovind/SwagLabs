package COM.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class shopInfo {
	
	@FindBy (xpath = "//input[@id='first-name']")
	private WebElement name;
	
	@FindBy (xpath = "//input[@id='last-name']")
	private WebElement lastname;
	
	@FindBy (xpath = "//input[@id='postal-code']")
	private WebElement postal;
	
	@FindBy (xpath = "//input[@id='continue']")
	private WebElement continueBtn;
	
	public shopInfo(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void nameField() {
		name.sendKeys("Ram");
	}
	
	public void lastNameField()
	{
		lastname.sendKeys("Charan");
	}
	
	public void postalCode() {
		postal.sendKeys("123456");
	}
	
	public void continueButton() {
		continueBtn.click();
	}

}
