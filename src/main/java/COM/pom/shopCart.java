package COM.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class shopCart {
	
	 @FindBy (xpath ="//a[@class='shopping_cart_link']" )
	  private WebElement shoppingCart;
	 
	 
	 public shopCart(WebDriver driver) {
		 PageFactory.initElements(driver, this);
	 }
	 
	 public void shopIcon() {
		 shoppingCart.click();
	 }

}
