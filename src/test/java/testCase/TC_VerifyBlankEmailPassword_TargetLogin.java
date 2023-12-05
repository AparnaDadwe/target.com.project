package testCase;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.TargetHomePage;
import target.com.project.utility.Utility;

public class TC_VerifyBlankEmailPassword_TargetLogin {
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
	public void verify_BlankEmail_BlankPassword() {
		
		homePage.clickOnLinkOFSignIn();
		homePage.clickOnSpanSignInLink();
		loginPage.clickOnSignInBTn();
		//Blank Email address
		String actualErrorMsg=loginPage.getBlankEmailAddress().getText();
//		System.out.println(actualErrorMsg);
		String expectedErrorMsg="Please enter an email or phone number";
		assertEquals(actualErrorMsg, actualErrorMsg);
		
		//blank password
		loginPage.getBlankPassword().getText();
//		System.out.println(loginPage.getBlankPassword().getText());
		assertEquals(loginPage.getBlankPassword().getText(), "Please enter your password");
	}
	@AfterMethod
	public void teraDown() {
		driver.quit();
	}

}
