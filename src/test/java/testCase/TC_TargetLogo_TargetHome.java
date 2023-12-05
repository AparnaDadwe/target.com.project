package testCase;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.TargetHomePage;
import target.com.project.utility.Utility;

public class TC_TargetLogo_TargetHome {
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
   public void verifyTargetLogoDisplay() {
	   homePage.getTargetLogo().isDisplayed();
	   assertTrue(homePage.getTargetLogo().isDisplayed());
   }
   @Test(enabled = false)
   public void  verifyClickOnTargetLogo() {
	   homePage.getTargetLogo().click();
   }
   @AfterMethod
   public void teardown() {
	   driver.quit();
   }
}
