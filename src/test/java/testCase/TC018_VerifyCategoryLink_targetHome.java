package testCase;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.TargetHomePage;
import target.com.project.utility.Utility;

public class TC018_VerifyCategoryLink_targetHome {
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
	public void verifyCategoryLink() {
		homePage.displayCategoryLink_TargetHome();
		assertTrue(homePage.displayCategoryLink_TargetHome());
	}
	
	@Test
	public void verifyClickonCategoryLink() {
		homePage.clickOnCategoryLink_TargetHome();
	}
	@AfterMethod
	public void tearDown() {
	  driver.quit();
	}
}
