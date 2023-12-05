package testCase;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.TargetHomePage;
import target.com.project.utility.Utility;

public class TC005_VerifySearchBox_TergetHomePage {
	WebDriver driver;
	TargetHomePage homePage;
	@BeforeMethod(alwaysRun = true)
	public void setUp() {
		  driver=Utility.getDriver();
		  driver.get(Utility.getProperty("url"));
		  driver.manage().window().maximize();
		  homePage=new TargetHomePage(driver);	
	}
	//Verify that the search box is present on the page and is visible to the user.
	@Test(groups = {"Smoke Test"},priority = 3)
	public void verifySearchBoxPresenttOnPage() {
		
		assertTrue(homePage.getDisplaySearchBox().isDisplayed());
		System.out.println(homePage.getDisplaySearchBox().isDisplayed());
	}
	
	//Verify that the search icon is present on the page and is visible to the user.
	@Test
	public void verifySearchIcon() {
		
		homePage.displaySearchIconOnSearchBox();
		assertTrue(homePage.displaySearchIconOnSearchBox());
		
      }
	//Verify that the search box is clickable or not.
	 @Test(priority = 1)
	  public void verifyClickOnSearchBox() {
		 homePage.clickSearchBox();
	  }
	//Verify that the placeholder text in search box .
	 @Test(groups= {"Regression Test"},priority = 4)
	public void verifyPlaceHolderTextInSearchBox(){
		
		String actualplaceHolderText=homePage.getDisplaySearchBox().getAttribute("placeholder");
		String expectedplaceHolderText="What can we help you find?";
		assertEquals(actualplaceHolderText, expectedplaceHolderText);
	}
	 @Test(groups= {"Smoke Test"},priority = 5)
	 public void verifySearchBoxAcceptUserInput() {
		 homePage.setInputTextInSearchBox("Baby Wipes");
	 }
	
	 
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
