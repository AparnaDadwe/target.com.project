package loginTestCase;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.TargetHomePage;
import target.com.project.utility.Utility;

public class Verify_ValidUsernameAndInvalidPassword {
	
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
	public void verify_ValidUsername_InvalidPassword() {
		
		homePage.clickOnLinkOFSignIn();
		homePage.clickOnSpanSignInLink();	
		loginPage.invalidTextInInputFields("appu88262@gmail.com", "fdgsd123454");
		loginPage.clickOnSignInBTn();
		loginPage.getTextErrorMsg().getText();	
		System.out.println(loginPage.getTextErrorMsg().getText());
		assertEquals(loginPage.getTextErrorMsg().getText(), "That password is incorrect.");
	}
	@AfterMethod
	public void teraDown() {
		driver.quit();
	}


}
