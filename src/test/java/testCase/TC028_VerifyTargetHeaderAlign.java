package testCase;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.TargetHeaderPage;
import target.com.project.utility.Utility;

public class TC028_VerifyTargetHeaderAlign {
	
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
	public void verifyAlign_TargetHeader() {
		
			int x=headerPage.getTargetHeader().getLocation().x;	
			System.out.println(x);
			int x2=headerPage.getTargetHeader().getLocation().x;
			System.out.println(x2);
			assertEquals(x, x2);
	}

}
