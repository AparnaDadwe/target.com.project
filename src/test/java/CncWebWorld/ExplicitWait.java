package CncWebWorld;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();

		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
	    
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a//span[text()='Downloads']"))).click();
		
	}

}
