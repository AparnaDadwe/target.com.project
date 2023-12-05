package testCase;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.TargetHomePage;
import target.com.project.utility.Utility;

public class TC_VerifyHomePageAfterLogin_Target {

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
	public void verifyNameDisplayOnHomePage() {
		
		homePage.clickOnLinkOFSignIn();
		homePage.clickOnSpanSignInLink();	
		loginPage.textInInputFields();
		loginPage.clickOnSignInBTn();
		homePage.getDisplayNameHomePage();
		assertTrue(homePage.getDisplayNameHomePage().isDisplayed());
		
	} 
	public void teraDown() {
		driver.quit();
	}
}
