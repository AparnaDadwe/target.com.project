package testCase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.TargetHeaderPage;
import target.com.project.utility.Utility;

public class TC026_VerifyTargetCircle_TargetHeader {
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
	public void verifyClinkOnTargetCircleLink() {
		headerPage.clickOnTargetCircleLinkHeader();
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
