package COM.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class finishPage {
	@FindBy (xpath = "//button[@id='finish']")
	private WebElement finishBtn;
	
	public finishPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void finishMethod() {
		finishBtn.click();
	}

}
