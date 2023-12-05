package testCase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.TargetHomePage;
import target.com.project.utility.Utility;

public class TC_AllLinkInnerTab {
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
	public void verifyAllLink_InnerTab() {
		
	}

}
