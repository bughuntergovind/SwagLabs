package BASE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class browserCode {

	//Chrome Browser Code
	public static WebDriver openChrome() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		return driver;
		
	}
	
	//Edge Browser Code
	public static WebDriver openEdge() {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		return driver;
		
	}
	
	
	
	public static WebDriver openIE() {
		WebDriverManager.iedriver().setup();
		WebDriver driver = new InternetExplorerDriver();
		return driver;
		
	}
	
	
	
	
}
