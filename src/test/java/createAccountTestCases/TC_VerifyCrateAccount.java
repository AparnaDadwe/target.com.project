package createAccountTestCases;

import java.io.IOException;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.CreateAccountPage;
import pages.TargetHomePage;
import target.com.project.utility.Utility;

public class TC_VerifyCrateAccount {
	
	WebDriver driver;
	TargetHomePage homePage;
	CreateAccountPage accountPage;

	@BeforeMethod
	public void setUp() {
		driver=Utility.getDriver();
		driver.get(Utility.getProperty("url"));
		driver.manage().window().maximize();
		homePage=new TargetHomePage(driver);
		accountPage=new CreateAccountPage(driver);

	}
	@Test(dataProvider="accountCreate")
	public void verify_AccountCreate(String email,String firstName,String lastName,String password) {
		homePage.clickOnLinkOFSignIn();
		homePage.clickOnLinkOnCreateAccount();
		accountPage.getEmailTextField().sendKeys(email);
		accountPage.getFirstNameTextField().sendKeys(firstName);
		accountPage.getLastNameTextField().sendKeys(lastName);
		accountPage.getCreatePasswordTextField().sendKeys(password);
		accountPage.clickOnKeepMeSignIn();
		accountPage.clickOnCreateAccountBtn();
	}
	
	@DataProvider(name = "accountCreate")
	public String[][] createAccountDataProvider() throws IOException {
String[][] accountCreateArray= {{"kartikHore123@gmail.com","Kartik","Hore","Kartik@1234"}};
		
		return accountCreateArray;
		
		}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}	
	}


