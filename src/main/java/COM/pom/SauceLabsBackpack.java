package COM.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceLabsBackpack {
 @FindBy (xpath ="//button[@id='add-to-cart-sauce-labs-backpack']" )
   private WebElement addToCart1;
 

 
 public SauceLabsBackpack(WebDriver driver) {
	 PageFactory.initElements(driver, this);
 }
 
 public void addCart1() {
	 addToCart1.click();
 }
 

 
 
}
