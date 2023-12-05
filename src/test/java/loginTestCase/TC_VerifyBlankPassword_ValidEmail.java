package loginTestCase;
//Check that login page functionality with a valid email id and a blank password.
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.TargetHomePage;
import target.com.project.utility.Utility;

public class TC_VerifyBlankPassword_ValidEmail {
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
	public void verify_ValidUsernameErrorMsg_ValidPasswordErrorMsg() {
		
		homePage.clickOnLinkOFSignIn();
		homePage.clickOnSpanSignInLink();	
		loginPage.invalidTextInInputFields("appu88262@gmail.com", "");
		loginPage.clickOnSignInBTn();
		//ValidEmailErrorMsg
		String actualPasswordErrorMsg=loginPage.getBlankPassword().getText();
		String expectedPasswordErrorMsg="Please enter your password";
        System.out.println(actualPasswordErrorMsg);
		assertEquals(actualPasswordErrorMsg, expectedPasswordErrorMsg);
		
		
	}
	@AfterMethod
	public void teraDown() {
		driver.quit();
	}
}
