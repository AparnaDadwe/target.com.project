package testCase;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.TargetHomePage;
import target.com.project.utility.Utility;

public class TC_Verify_SearchList {
	WebDriver driver;
	TargetHomePage homePage;
	@BeforeMethod
	public void setUp() {
		driver=Utility.getDriver();
		Utility.implicitWaitFunction(driver);
		driver.get(Utility.getProperty("url"));
		driver.manage().window().maximize();
		homePage=new TargetHomePage(driver);
	}
	@Test
	public void verifySearchList() {
		//Verify Search List with expected and actual
		homePage.clickSearchBox();
		List<String> expectedSearchList= new ArrayList<String>();
		expectedSearchList=Arrays.asList("toilet paper","womens dresses","womens sandals","paper towels","paper plates",
				"girls shorts","glue sticks","baby wipes","clorox wipes","tortilla chips");
		homePage.getSearchList_TargetHome();
//		System.out.println(homePage.getSearchList_TargetHome());
		assertEquals(homePage.getSearchList_TargetHome(), expectedSearchList);
	}
	
	
	

}
