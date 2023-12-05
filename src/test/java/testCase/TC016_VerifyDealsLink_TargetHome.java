package testCase;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.TargetHomePage;
import target.com.project.utility.Utility;

public class TC016_VerifyDealsLink_TargetHome {
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
public void verifyClickOnDealsLink() {
	homePage.clickOnDealsLink_TargetHome();
}	
	@Test
	public void verifyDealsLinkDisplay() {
		assertTrue(homePage.displayDealsLink_TargetHome());
	}
	@AfterMethod
	public void tearDown() {
	  driver.quit();
	}
}
