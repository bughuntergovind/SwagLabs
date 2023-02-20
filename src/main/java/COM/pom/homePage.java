package COM.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage {
	
	//Sauce Labs Backpack
	  @FindBy (xpath = "//div[text()='Sauce Labs Backpack']")
	  private WebElement sauceLabsBackpack ;
	
	//Sauce Labs Bike Light
	  @FindBy (xpath = "//div[text()='Sauce Labs Bike Light']")
	  private WebElement sauceLabsBikeLight ;
	
	//Sauce Labs Bolt T-Shirt
	  @FindBy (xpath = "//div[text()='Sauce Labs Bolt T-Shirt']")
	  private WebElement sauceLabsBoltTshirt ;
	
	//Sauce Labs Fleece Jacket
      @FindBy (xpath = "//div[text()='Sauce Labs Fleece Jacket']")
   	  private WebElement sauceLabsFleeceJacket ;
      
    //Creating method to use The WebElement of HomePage
      
      public homePage(WebDriver driver) {
    	  PageFactory.initElements(driver,this);
      }
      
      //Method of Sauce Labs Backpack
      public void clicksauceLabsBackpack() {
    	  sauceLabsBackpack.click();
      }
      
      //Method of sauceLabsBikeLight
      public void clicksauceLabsBikeLight() {
    	  sauceLabsBikeLight.click();
      }
      
      //Method of sauceLabsBoltTshirt
      public void clicksauceLabsBoltTshirt() {
    	  sauceLabsBoltTshirt.click();
		
	}
      
      //Method of sauceLabsFleeceJacket
      public void clicksauceLabsFleeceJacket() {
    	  sauceLabsFleeceJacket.click();
		
	}
	

}
