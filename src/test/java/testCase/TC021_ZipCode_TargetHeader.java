package testCase;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.TargetHeaderPage;
import target.com.project.utility.Utility;

public class TC021_ZipCode_TargetHeader {
	
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
	public void verifyZipCode_TaargetHeader() {
		headerPage.clickOnZipCode_TargetHeader();
	}
	@Test
	public void verifyTrackLocationICon_TargetHeader() {
	
		assertTrue(headerPage.getTrackLocationIconHeade().isDisplayed());
	}
	@Test(enabled = false)
	public void verifyTextOfZipCode_TargetHeader() {
		String actualTextZipCode=headerPage.getTextOfZipCodeHeader().getText();
		
		String expectedTextZipCode="44002";
		assertEquals(actualTextZipCode, expectedTextZipCode);
		
	}
	@AfterMethod
	 public void tearDown() {
		 driver.quit();
	 }
	


}
