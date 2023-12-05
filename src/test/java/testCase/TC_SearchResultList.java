package testCase;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class TC_SearchResultList {
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		 driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
  	   driver.get("https://www.target.com/");
  	   driver.manage().window().maximize();	
	}
	@Test
	public void getSearchResultList() {
//		driver.findElement(By.xpath("//input[@id='search']")).click();
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Baby Diaper");
	List<WebElement> searchList=	driver.findElements(By.xpath("//ul//li[@class='styles__LiWithBorder-sc-1j0iz5j-0 kAPCPA']//a"));
	System.out.println("Size of The Search List is "+ searchList.size());
	Iterator<WebElement> itrList = searchList.iterator();
	while(itrList.hasNext()) {
		WebElement elm=itrList.next();
		System.out.println(elm.getText()+" - "+elm.getAttribute("href"));
		}
	}
}
