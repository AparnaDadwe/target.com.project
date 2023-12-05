package testCase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.TargetHomePage;
import target.com.project.utility.Utility;

public class TC014_VerifyWhatsNewLink_TargetHome {
	WebDriver driver;
	TargetHomePage homePage;
	@BeforeMethod
 public void setUp() {
	 driver=Utility.getDriver();
	 driver.get(Utility.getProperty("url"));
	 driver.manage().window().maximize();
	homePage=new  TargetHomePage(driver) ;
 }
	@Test
	public void verifyWhatsNewLinkDisplay() {
		homePage.displayWhatNewLink_TargetHome();
	}
	@Test
	public void verifyClickOnWhatsNewLink() {
		homePage.clickOnWhatNewLink_TargetHome();
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
