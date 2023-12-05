package testCase;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.TargetHomePage;
import target.com.project.utility.Utility;

public class TC_VerifyTargetHomePage {
	WebDriver driver;
	TargetHomePage homePage;
	
	@BeforeMethod
  public void setUp() {
	  
	  driver=Utility.getDriver();
	  driver.get(Utility.getProperty("url"));
	  driver.manage().window().maximize();
	  homePage =new TargetHomePage(driver);
	 
	  
	  
  }
  @Test
public void verifyTargetHomePageTitle() {
	  
//	  homePage.getGetPageTitle().getText();
	  String actualTitle=homePage.getGetPageTitle().getText();
	  System.out.println(actualTitle);
//	  String expectedTitle="Target : Expect More. Pay Less.";
//      assertEquals(actualTitle, expectedTitle);
//     System.out.println(homePage.getGetPageTitle().getText());
    

 }
  @Test
  public void verifyCartIcon_TargetHomePage() {
	  homePage.displayCartIcon_TargetHomePage();
  }
  @Test
  public void verifySignInLinkClick_TargetHomePage() {
	  homePage.clickOnLinkOFSignIn();
	 
  }
  @Test
  public void verifySignInISDisplay_TargetHomePage() {
	  homePage.signInLinkIsDisplay();
  }
 
  
 
//  @AfterMethod
// 
//  public void tearDown() {
//	  driver.quit();
//  }

}
