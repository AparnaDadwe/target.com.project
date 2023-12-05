package loginTestCase;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.TargetHomePage;
import target.com.project.utility.Utility;

public class TC_VerifyInvalidUsernameAndValidPassword {
	WebDriver driver;
	TargetHomePage homePage;
	LoginPage loginPage;

	@BeforeMethod
	public void setUp() {
		driver=Utility.getDriver();
		driver.get(Utility.getProperty("url"));
		driver.manage().window().maximize();
		homePage=new TargetHomePage(driver);
		loginPage=new LoginPage(driver);

	}
	@Test
	public void verify_InvalidUsername_ValidPassword() {
		
		homePage.clickOnLinkOFSignIn();
		homePage.clickOnSpanSignInLink();	
		loginPage.invalidTextInInputFields("aparna88262@gmail.com", "Aparna@1234");
		loginPage.clickOnSignInBTn();
		loginPage.getTextErrorMsg().getText();	
//		System.out.println(loginPage.getTextErrorMsg().getText());
		assertEquals(loginPage.getTextErrorMsg().getText(), "We can't find your account.");
	}
	@AfterMethod
	public void teraDown() {
		driver.quit();
	}
}
