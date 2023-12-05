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

public class TC_VerifyCreateAccount_ExcelData {
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
	@Test(dataProvider="crateAccount")
	public void verify_CreateAcccount(String email,String firstName,String lastName,String phone,String password) 
	{
		homePage.clickOnLinkOFSignIn();
		homePage.clickOnLinkOnCreateAccount();
		accountPage.getEmailTextField().sendKeys(email);
		accountPage.getFirstNameTextField().sendKeys(firstName);
		accountPage.getLastNameTextField().sendKeys(lastName);
		accountPage.getPhoneNoTextField().sendKeys(phone);
		accountPage.getCreatePasswordTextField().sendKeys(password);
		accountPage.clickOnCreateAccountBtn();
	}
	
	@DataProvider(name = "crateAccount")
	public String[][] createAccountDataProvider() throws IOException {
		 //ab yeh data excel se read karna hai 
		List<String> data=Utility.readExcelFile();// excel se data yaha aagaya 
		//Now we not fill array we make array and uska object banana padega
		String[][] createAccountArray = new String[1][5];
		for(int i=0;i<data.size();i++) {
			
			createAccountArray[0][i]=data.get(i);
		
		}
		return createAccountArray;
		
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}




