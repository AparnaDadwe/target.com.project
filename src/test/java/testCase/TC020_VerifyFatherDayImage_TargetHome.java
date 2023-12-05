package testCase;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.TargetHomePage;
import target.com.project.utility.Utility;

public class TC020_VerifyFatherDayImage_TargetHome {
	
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
	public void verifyFatherDayImage_display() {
		assertTrue(homePage.getFatherDayGiftImage().isDisplayed());
	}
	@Test
    public void verifyClickOnFathersDayImage() {
    	homePage.clickOnFatherDayGiftImage();
    }
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
