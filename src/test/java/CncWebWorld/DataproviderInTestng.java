package CncWebWorld;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderInTestng {
	WebDriver driver;
	@Test(dataProvider = "searchDataProvider")
	public void searchKeyValue(String keyword) {
		
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
	WebElement searchTextbox=	driver.findElement(By.xpath("//textarea[@name='q']"));
	searchTextbox.sendKeys(keyword);
	searchTextbox.sendKeys(Keys.ENTER);
      }
	//Dataprovider return two dimentional array
	@DataProvider(name = "searchDataProvider")
	public Object[][] searchDataProviderMethod()
	{
		  Object[][] searchData=new Object[2][1];
		  
		  searchData[0][0]="Selenium";
		  searchData[1][0]="Java";
		  return searchData;
	}
 }
