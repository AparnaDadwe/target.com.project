package CncWebWorld;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		Actions act=new Actions(driver);
	WebElement doubleClickButton=	driver.findElement(By.id("doubleClickBtn"));
	
	act.doubleClick(doubleClickButton).build().perform();
		
	}

}
