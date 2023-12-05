package testCase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.TargetHomePage;
import target.com.project.utility.Utility;

public class TC002_VerifySignIn_TargetHome {
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
	public void verifyClickOnSignIn_TargetHome() {
		
		homePage.clickOnLinkOFSignIn();
	
	} 
	@Test
	
	public void verifySignInDisplay_TargetHome() {
		homePage.signInLinkIsDisplay();
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
