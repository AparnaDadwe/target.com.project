package testCase;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.TargetHeaderPage;
import target.com.project.utility.Utility;

public class TC022_VerifyWaterTown_TargetHeader {
	
	WebDriver driver;
	TargetHeaderPage headerPage;
	@BeforeMethod
	public void setUp() {
		  driver=Utility.getDriver();
		  driver.get(Utility.getProperty("url"));
		  driver.manage().window().maximize();
		  headerPage=new TargetHeaderPage(driver);	
	}
	@Test
	public void VerifyClickWaterTown() {
		headerPage.clickOnBtnWatertownStoreHeader();
	}
	
	@Test
	public void VerifyIconWaterTown() {
		
		assertTrue(headerPage.getWatertownStoreconHeader().isDisplayed());
	}
	@Test(enabled = false)
	public void verifyTextOfWaterTownStore() {
		String actualText=headerPage.getTextOfWaterTownStoreHeader().getText();
		String expectedText="Watertown";
		
		assertEquals(actualText, expectedText);
	}
	@AfterMethod
	 public void tearDown() {
		 driver.quit();
	 }

}
