package testCase;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import pages.FooterPage;
import target.com.project.utility.Utility;

public class TC_AboutUs_TargetFooter {
	WebDriver driver;
	FooterPage ftPage;
	@AfterMethod
	public void setUp() {
		driver=Utility.getDriver();
		driver.get(Utility.getProperty("url"));
		driver.manage().window().maximize();
		ftPage=new FooterPage(driver);
	}
	@Test
	public void verifyAboutUs() {
		
		ftPage.clickOnAboutTarget();
//		driver.getTitle();
//		String expectedTitle="About Target Corporation";
//		assertEquals(driver.getTitle(), expectedTitle);
         
	}

}
