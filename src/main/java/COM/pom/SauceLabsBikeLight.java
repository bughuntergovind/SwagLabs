package COM.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceLabsBikeLight {
	
	@FindBy (xpath = "//button[@id='add-to-cart-sauce-labs-bike-light']")
	private WebElement addToCart2;
	
	public SauceLabsBikeLight(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void addCart2() {
		addToCart2.click();
	}

}
