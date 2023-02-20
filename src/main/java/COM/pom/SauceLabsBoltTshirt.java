package COM.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceLabsBoltTshirt {

	@FindBy (xpath = "//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")
	private WebElement addToCart3;
	
	 public SauceLabsBoltTshirt(WebDriver driver) {
		 PageFactory.initElements(driver, this);
	 }
	 
	 public void addCart3() {
		 addToCart3.click();
	 }
}
