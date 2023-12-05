package testCase;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.TargetHomePage;
import target.com.project.utility.Utility;

public class TC010_VerifyCartLink_TargetHome {
	WebDriver driver;
	TargetHomePage homePage;
	@BeforeMethod
	public void setUp() {
		  driver=Utility.getDriver();
		  driver.get(Utility.getProperty("url"));
		  driver.manage().window().maximize();
		  homePage=new TargetHomePage(driver);	
	}
	@Test
	public void verifyDisplayCartIcon() {
		homePage.displayCartIcon_TargetHomePage();
		assertTrue(homePage.displayCartIcon_TargetHomePage());
	}
	@Test
	public void verfyClickOnCartIcon() {
		homePage.clickOnCartIcon_TargetHome();
	}
}
