package COM.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class checkOut {
	
	@FindBy (xpath = "//button[@id='checkout']")
	private WebElement checkOutBtn;
	
	public checkOut(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void checkOutButtonMethod() {
		checkOutBtn.click();
	}

}
