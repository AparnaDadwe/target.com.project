package testCase;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.TargetHomePage;
import target.com.project.utility.Utility;

public class TC_VerifyCrrateTargetAccountBtn_TargetLogin {
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
	public void verify_clickOnCreateTargetAccountBtn() {
		
		homePage.clickOnLinkOFSignIn();
		homePage.clickOnSpanSignInLink();
		loginPage.clickOnCreateTargetAccountBtn();
	}
	
	public void teraDown() {
		driver.quit();
	}

}
