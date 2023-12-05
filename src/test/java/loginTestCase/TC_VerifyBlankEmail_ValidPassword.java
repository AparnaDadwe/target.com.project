package loginTestCase;
//Validate login page functionality with a blank email address and valid password.
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.TargetHomePage;
import target.com.project.utility.Utility;

public class TC_VerifyBlankEmail_ValidPassword {
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
		loginPage.invalidTextInInputFields("", "Aparna@1234");
		loginPage.clickOnSignInBTn();
		//ValidEmailErrorMsg
		String actualEmailErrorMsg=loginPage.getBlankEmailAddress().getText();
		String expectedEmailErrorMsg="Please enter an email or phone number";
        System.out.println(actualEmailErrorMsg);
		assertEquals(actualEmailErrorMsg, expectedEmailErrorMsg);
		
		
	}
	@AfterMethod
	public void teraDown() {
		driver.quit();
	}
}
