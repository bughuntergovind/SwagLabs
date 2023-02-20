package COM.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceLabsFleeceJacket {
	
	@FindBy (xpath = "//button[@id='add-to-cart-sauce-labs-fleece-jacket']")	
	private WebElement fleeceJac;
	
	public SauceLabsFleeceJacket(WebDriver driver) {
		PageFactory.initElements(driver,this);		
	}
	
	public void addCart3() {
		
	}

}
