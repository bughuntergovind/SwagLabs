package TEST;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import BASE.browserCode;
import COM.pom.SauceLabsBackpack;
import COM.pom.SauceLabsBikeLight;
import COM.pom.SauceLabsBoltTshirt;
import COM.pom.SauceLabsFleeceJacket;
import COM.pom.checkOut;
import COM.pom.finishPage;
import COM.pom.homePage;
import COM.pom.loginData;
import COM.pom.logoutPage;
import COM.pom.shopCart;
import COM.pom.shopInfo;
import UTILITY.utilityClass;

public class testClass {
	WebDriver driver;
	loginData login;
	homePage home;
	SauceLabsBackpack sauceLab1 ;
	shopCart cart;
    shopInfo shopInfo;
    checkOut checkOut;
    finishPage finish;
	
	
	//Browser Code
	@BeforeTest
	@Parameters("Browsers")
	public  void openBrowser(String browser) {
		if(browser.equals("chrome")) {
			driver = browserCode.openChrome();
		}
//		else if (browser.equals("edge")) {
//			driver=browserCode.openEdge();
//			
//		}
//		
		
		
		driver.manage().window().maximize();
	}
	
	
	//Open The Website
	@BeforeClass
	public void hitTheUrl() throws InterruptedException {
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		Thread.sleep(2000);
	}
	
	@BeforeMethod
	public void loginDetails() throws InterruptedException, EncryptedDocumentException, IOException {
		
		 login = new loginData(driver);
		 //get username from Excel Data Utility Class
		String user= utilityClass.excelSheetData(0, 0);
		 //username method
		 login.usernameData(user);
		 Thread.sleep(2000);
		 
		 //get password from Excel Data Utility Class
		 String pass=utilityClass.excelSheetData(1, 0);
		 login.passwordData(pass);
		 Thread.sleep(2000);
		 login.loginButton();
		
	}
	
	@Test (priority = 1)
	public void click1() throws InterruptedException {
		 home = new homePage(driver);
		 Thread.sleep(1000);
		 home.clicksauceLabsBackpack();
		 Thread.sleep(2000);
		 
		 //SauceLabsBackpack Page Data
		  sauceLab1 = new SauceLabsBackpack(driver);
		  sauceLab1.addCart1();
		  Thread.sleep(2000);
		  
		  //Shopcart Page data
		   cart = new shopCart(driver);
		  cart.shopIcon();
          Thread.sleep(2000);
		  
		  
		//CheckOut Page Data
		  checkOut = new checkOut(driver);
		  checkOut.checkOutButtonMethod();
		  Thread.sleep(2000);
		 
		 //Shop Info Page
		 
		  shopInfo = new shopInfo(driver);
		  shopInfo.nameField();
		  Thread.sleep(1000);
		  shopInfo.lastNameField();
		  Thread.sleep(1000);
		  shopInfo.postalCode();
		  Thread.sleep(1000);
		  shopInfo.continueButton();
		  Thread.sleep(2000);
		  
		  
		  
		  
		  //Finish Page Data
		  finish = new finishPage(driver);
		  finish.finishMethod();
		  
		

	}
	
	@Test (priority = 2)
	public void click2() throws InterruptedException {
		 home = new homePage(driver);
		 Thread.sleep(1000);
		 home.clicksauceLabsBikeLight();
		 
		 Thread.sleep(2000);
		 
		 
		 //Sauce bikeLight addTO cart Data
		 SauceLabsBikeLight bikeLight = new SauceLabsBikeLight(driver);
		 bikeLight.addCart2();
		 Thread.sleep(1000);
		
		 
		 
		  //Shopcart Page data
		   cart = new shopCart(driver);
		  cart.shopIcon();
         Thread.sleep(2000);
		  
		  
		//CheckOut Page Data
		  checkOut = new checkOut(driver);
		  checkOut.checkOutButtonMethod();
		  Thread.sleep(2000);
		 
		 //Shop Info Page
		 
		  shopInfo = new shopInfo(driver);
		  shopInfo.nameField();
		  Thread.sleep(1000);
		  shopInfo.lastNameField();
		  Thread.sleep(1000);
		  shopInfo.postalCode();
		  Thread.sleep(1000);
		  shopInfo.continueButton();
		  Thread.sleep(2000);
		  
		  	  
		  //Finish Page Data
		  finish = new finishPage(driver);
		  finish.finishMethod();
		  
	}
	
	@Test (priority = 3)
	public void click3() throws InterruptedException {
		 home = new homePage(driver);
		 Thread.sleep(1000);
		 home.clicksauceLabsBoltTshirt();
		 
		 
		 Thread.sleep(2000);
		 
		 
		 //Sauce Tshirt addTO cart Data
		 SauceLabsBoltTshirt sauceLab2 = new SauceLabsBoltTshirt(driver);
		 sauceLab2.addCart3();
		 
		 
		  //Shopcart Page data
		   cart = new shopCart(driver);
		  cart.shopIcon();
         Thread.sleep(2000);
		  
		  
		//CheckOut Page Data
		  checkOut = new checkOut(driver);
		  checkOut.checkOutButtonMethod();
		  Thread.sleep(2000);
		 
		 //Shop Info Page
		 
		  shopInfo = new shopInfo(driver);
		  shopInfo.nameField();
		  Thread.sleep(1000);
		  shopInfo.lastNameField();
		  Thread.sleep(1000);
		  shopInfo.postalCode();
		  Thread.sleep(1000);
		  shopInfo.continueButton();
		  Thread.sleep(2000);
		  
		  	  
		  //Finish Page Data
		  finish = new finishPage(driver);
		  finish.finishMethod();
		 
		 
	}
	
	@Test (priority = 4)
	public void click4() throws InterruptedException {
		 home = new homePage(driver);
		 Thread.sleep(1000);
		 home.clicksauceLabsFleeceJacket();
		 
		 
		 Thread.sleep(2000);
		 
		 
		 //Sauce FleeceJacket addTO cart Data
		 SauceLabsFleeceJacket fleece = new SauceLabsFleeceJacket(driver);
		 fleece.addCart3();
		 
		 	 
		  //Shopcart Page data
		   cart = new shopCart(driver);
		  cart.shopIcon();
         Thread.sleep(2000);
		  
		  
		//CheckOut Page Data
		  checkOut = new checkOut(driver);
		  checkOut.checkOutButtonMethod();
		  Thread.sleep(2000);
		 
		 //Shop Info Page
		 
		  shopInfo = new shopInfo(driver);
		  shopInfo.nameField();
		  Thread.sleep(1000);
		  shopInfo.lastNameField();
		  Thread.sleep(1000);
		  shopInfo.postalCode();
		  Thread.sleep(1000);
		  shopInfo.continueButton();
		  Thread.sleep(2000);
		  
		  	  
		  //Finish Page Data
		  finish = new finishPage(driver);
		  finish.finishMethod();
	}
	
	@AfterMethod
	public void logOutWebsite(ITestResult result) throws InterruptedException, IOException {
		
		//Failed Test Screenshot Code
		if (result.FAILURE==result.getStatus()) {
			utilityClass.screenshot(driver);
			
		}		
		
		//Logout code
		logoutPage logout = new logoutPage(driver);
		Thread.sleep(2000);
		logout.clickHamburger();
		Thread.sleep(2000);
		logout.clicklogOutButton();
		Thread.sleep(4000);
		
	}
	@AfterClass
	public void closeTheBrowser() {
		driver.close();
	}
	
 
}
