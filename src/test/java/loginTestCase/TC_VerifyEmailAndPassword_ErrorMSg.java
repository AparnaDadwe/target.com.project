package loginTestCase;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.TargetHomePage;
import target.com.project.utility.Utility;

public class TC_VerifyEmailAndPassword_ErrorMSg {
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
		loginPage.invalidTextInInputFields("aparna88262", "@##!@%&*");
		loginPage.clickOnSignInBTn();
		//ValidEmailErrorMsg
		String actualUserNameErrorMsg=loginPage.getUserNameErrorMsg().getText();
		String expectedUserNameErrorMsg="Please enter a valid email or phone number";
        System.out.println(actualUserNameErrorMsg);
		assertEquals(actualUserNameErrorMsg, expectedUserNameErrorMsg);
		
		//ValidPasswordErorMsg
		String actualPasswordErrorMsg=loginPage.getPasswordErrorMsg().getText();
		String expectedPasswordErrorMsg="Please enter a valid password";
   		System.out.println(actualPasswordErrorMsg);
		assertEquals(actualPasswordErrorMsg, expectedPasswordErrorMsg);
	}
	@AfterMethod
	public void teraDown() {
		driver.quit();
	}
}
