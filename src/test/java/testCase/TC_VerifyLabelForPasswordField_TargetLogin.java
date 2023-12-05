package testCase;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.TargetHomePage;
import target.com.project.utility.Utility;

//	Check that if fields have proper placeholder or not

public class TC_VerifyLabelForPasswordField_TargetLogin {
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
	public void verify_LoginWithValidCredential() {
		
		homePage.clickOnLinkOFSignIn();
		homePage.clickOnSpanSignInLink();	
		loginPage.getLabelForPassword().getText();
		assertEquals(loginPage.getLabelForPassword().getText(), "Password");
		
		
	} 
	@AfterMethod
	public void teraDown() {
		driver.quit();
	}
}
