package CncWebWorld;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {
	
	WebDriver driver;
	@Parameters("Browser")
	
	@BeforeTest
	
	public void setUp(String browser) 
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
			driver.manage().window().maximize();
			
		}
		else if(browser.equalsIgnoreCase("firefox")) 
		{
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			
		}
		else
		{
			System.out.println("No browser checked");
		}
	}
	
	@Test
	public void test1() {
		
		driver.get("https://www.qafox.com/");
    }
	
	@AfterTest
	 
	public void tearDown() {
		driver.quit();
	}
	

}
